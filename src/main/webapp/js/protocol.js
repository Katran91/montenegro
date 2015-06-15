/**
 * Created by Katran on 13.06.2015.
 */
(function() {
    var app = angular.module('protocol', []);

    app.controller('FormController', ['$http','$scope', function($http, $scope){
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
                    com_participant: protocol.com_participant,

                    instStatistic: {
                        institut: protocol.institution_stat,
                        studentCount: protocol.stat_count
                    },

                    winner1: {
                        student: protocol.student1,
                        studentInstitut: protocol.s_institution_stat1,
                        teacher: protocol.teacher1,
                        kafedra: protocol.kafedra_stat1
                    },

                    winner2: {
                        student: protocol.student2,
                        studentInstitut: protocol.s_institution_stat2,
                        teacher: protocol.teacher2,
                        kafedra: protocol.kafedra_stat2
                    },

                    winner3: {
                        student: protocol.student3,
                        studentInstitut: protocol.s_institution_stat3,
                        teacher: protocol.teacher3,
                        kafedra: protocol.kafedra_stat3
                    }
                }
            }).
                success(function (data, status, headers, config) {
                    $scope.successMsg = data;
                }).
                error(function (data, status, headers, config) {
                    if (status == 400) {
                        $scope.errMessages = data;
                    } else {
                        alert('Unexpected server error.');
                    }
                });

            $scope.protocol = {}
        }
    }]);
})();