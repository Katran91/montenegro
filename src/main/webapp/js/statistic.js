/**
 * Created by astratii on 6/16/2015.
 */
(function() {
    var statistic = angular.module('statistic', ['smart-table']);

    statistic.controller('tableController', ['$scope', '$http', '$filter', function ($scope,$http,$filter) {
        $scope.rowCollection = [];
        $http({
            method: 'GET',
            url: 'api/statistic/protocols'
        }).
            success(function (data, status, headers, config) {
                $scope.rowCollection = data;
                var ir = $scope.rowCollection;
            }).
            error(function (data, status, headers, config) {
                $scope.rowCollection = [{id : null, name:'Немає доступних протоколів'}]
            });

        $scope.displayedCollection = [].concat($scope.rowCollection);

        $scope.save = function (row) {
            $http({
                method: 'POST',
                url: 'api/statistic/update',
                data: row
            }).
                success(function (data, status, headers, config) {
                    $scope.successMsg = data;
                    alert('Рядок було успішно оновлено');
                }).
                error(function (data, status, headers, config) {
                    if (status == 400) {
                        $scope.errMessages = data;
                    } else {
                        alert('Unexpected server error.');
                    }
                });
        }
    }]);


    statistic.directive('contenteditable', function() {
        return {
            require: 'ngModel',
            link: function(scope, elm, attrs, ctrl) {
                // view -> model
                elm.bind('blur', function() {
                    scope.$apply(function() {
                        ctrl.$setViewValue(elm.html());
                    });
                });

                // model -> view
                ctrl.render = function(value) {
                    elm.html(value);
                };

                elm.bind('keydown', function(event) {
                    var esc = event.which == 27,
                        el = event.target;

                    if (esc) {
                        ctrl.$setViewValue(elm.html());
                        el.blur();
                        event.preventDefault();
                    }

                });

            }
        };
    });
})();