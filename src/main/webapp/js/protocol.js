/**
 * Created by Katran on 13.06.2015.
 */
(function() {
    var app = angular.module('protocol', []);

    app.factory('protocolService', function(){
        var protocolService = {};

        protocolService.protocol = {};
        protocolService.institutesList = [];

        protocolService.initializeEmptyProtocol = function () {
            protocolService.protocol.comParticipants = [{id:1}];
            protocolService.protocol.winners = [{id:1}];
            protocolService.protocol.instStatistic = [{id:1}];
        };

        protocolService.setProtocol = function (protocol) {
            angular.copy(protocol, protocolService.protocol);
        };

        protocolService.getProtocolName = function(protocol) {
            for(i = 0; i <  protocolService.institutesList.length; i++){
                if(protocolService.institutesList[i].id == protocol.institute){
                    return protocolService.institutesList[i].code + "/" + protocol.categoryName + "/" + protocol.date;
                }
            }

            return protocol.institute + "/" + protocol.categoryName + "/" + protocol.date;
        };

        return protocolService;
    });


    app.controller('FormController', ['$http','$scope', 'protocolService', function($http, $scope, protocolService){
        $scope.protocol = protocolService.protocol;

        protocolService.initializeEmptyProtocol();

        var form = this;
        form.institutes = [];
        $http({
            method: 'GET',
            url: 'api/protocol/getInstitute'
        }).
            success(function (data, status, headers, config) {
                form.institutes = data;
            }).
            error(function (data, status, headers, config) {
                form.institutes = [{id : null, name:'Немає доступних інститутів'}]
            });

        form.kafedras = [];
        $http({
            method: 'GET',
            url: 'api/protocol/getKafedra'
        }).
            success(function (data, status, headers, config) {
                form.kafedras = data;
            }).
            error(function (data, status, headers, config) {
                form.kafedras = [{id : null, name:'Немає доступних кафедр'}]
            });

        form.dysciplinas = [];
        $http({
            method: 'GET',
            url: 'api/protocol/getDysciplina'
        }).
            success(function (data, status, headers, config) {
                form.dysciplinas = data;
            }).
            error(function (data, status, headers, config) {
                form.dysciplinas = [{id : null, name:'Немає доступних дисциплін'}]
            });

        $scope.send = function(protocol){
            $http({
                method: 'POST',
                url: 'api/protocol/add',
                data: {
                    date: protocol.date,
                    category: protocol.category,
                    categoryName: protocol.categoryName,
                    kafedra: protocol.kafedra,
                    institute: protocol.institute,
                    comHead: protocol.comHead,

                    comParticipants: protocol.comParticipants,
                    winners: protocol.winners,
                    instStatistic: protocol.instStatistic
                }
            }).
                success(function (data, status, headers, config) {
                    protocolService.initializeEmptyProtocol();
                    $scope.successMsg = data;
                    alert('Протокол було успішно додано');
                }).
                error(function (data, status, headers, config) {
                    protocolService.initializeEmptyProtocol();
                    if (status == 400) {
                        $scope.errMessages = data;
                    } else {
                        alert('Unexpected server error.');
                    }
                });

            protocolService.initializeEmptyProtocol();
        };

        $scope.addComParticipant = function() {
            var newItemNo = $scope.protocol.comParticipants.length+1;
            $scope.protocol.comParticipants.push({'id':newItemNo});
        };

        $scope.addWinner = function() {
            var newItemNo = $scope.protocol.winners.length+1;
            $scope.protocol.winners.push({'id':newItemNo});
        };

        $scope.addStatistic = function() {
            var newItemNo = $scope.protocol.instStatistic.length+1;
            $scope.protocol.instStatistic.push({'id':newItemNo});
        };


    }]);

    app.controller('ChooseController', ['$http','$scope', '$filter', 'protocolService', function($http, $scope, $filter, protocolService){
        this.protocolService = protocolService;
        var chooser = this;

        $http({
            method: 'GET',
            url: 'api/protocol/getInstitute'
        }).
            success(function (data, status, headers, config) {
                chooser.protocolService.institutesList = data;
            }).
            error(function (data, status, headers, config) {
                chooser.institutesList = [{id : null, name:'Немає доступних інститутів'}]
            });

        $http({
            method: 'GET',
            url: 'api/protocol/getProtocolsList'
        }).
            success(function (data, status, headers, config) {
                chooser.protocolsList = data;
                for(i = 0; i < chooser.protocolsList.length; i++){
                    chooser.protocolsList[i].date =  $filter('date')(chooser.protocolsList[i].date, "yyyy-MM-dd");
                }
            }).
            error(function (data, status, headers, config) {
                chooser.protocolsList = [{id : null, name:'Немає доступних протоколів'}]
            });



        $scope.showProtocol = function(protocol){
            alert(protocolService.getProtocolName(protocol));

            protocolService.setProtocol(protocol);
        };
    }]);
})();