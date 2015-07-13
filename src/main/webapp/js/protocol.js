/**
 * Created by Katran on 13.06.2015.
 */
(function() {
    var app = angular.module('protocol', []);

    app.controller('FormController', ['$http','$scope', function($http, $scope){
        $scope.com_participants = [{id:1},{id:2}];

        var form = this;
        form.instituts = [];
        $http({
            method: 'GET',
            url: 'api/protocol/getInstitut'
        }).
            success(function (data, status, headers, config) {
                form.instituts = data;
            }).
            error(function (data, status, headers, config) {
                form.instituts = [{id : null, name:'Немає доступних інститутів'}]
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
            var winners = [];
            var com_participants = [];

            $http({
                method: 'POST',
                url: 'api/protocol/add',
                data: {
                    date: protocol.date,
                    category: protocol.category,
                    category_name: protocol.category_name,
                    kafedra: protocol.kafedra,
                    institut: protocol.institut,
                    com_head: protocol.com_head,

                    instStatistic: {
                        institut: protocol.institution_stat,
                        studentCount: protocol.stat_count
                    },

                    com_participants: protocol.com_participants,
                    winners: winners
                }
            }).
                success(function (data, status, headers, config) {
                    $scope.successMsg = data;
                    alert('Протокол було успішно додано');
                }).
                error(function (data, status, headers, config) {
                    if (status == 400) {
                        $scope.errMessages = data;
                    } else {
                        alert('Unexpected server error.');
                    }
                });

            $scope.protocol = {}
        };

        $scope.addComParticipant = function() {
            var newItemNo = $scope.com_participants.length+1;
            $scope.com_participants.push({'id':newItemNo});
        };
    }]);
})();