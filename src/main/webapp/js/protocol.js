/**
 * Created by Katran on 13.06.2015.
 */
(function() {
    var app = angular.module('protocol', []);

    app.controller('FormController', ['$http','$scope', function($http, $scope){
        $scope.send = function(protocol){
            //alert(protocol.date);
            $http({
                method: 'POST',
                url: 'api/protocol/add',
                data: {
                    date: protocol.date,
                    category: protocol.category,
                    category_name: protocol.category_name
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

            protocol = {};
        }
    }]);
})();