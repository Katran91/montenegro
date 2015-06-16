/**
 * Created by astratii on 6/16/2015.
 */
(function() {
    var app = angular.module('statistic', ['smart-table']);

    app.controller('tableController', ['$scope', '$http', '$filter', function (scope,$http,$filter) {
        scope.rowCollection = [];
        $http({
            method: 'GET',
            url: 'api/statistic/protocols'
        }).
            success(function (data, status, headers, config) {
                scope.rowCollection = data;
                var ir = scope.rowCollection;
            }).
            error(function (data, status, headers, config) {
                scope.rowCollection = [{id : null, name:'Немає доступних протоколів'}]
            });

        scope.displayedCollection = [].concat(scope.rowCollection);
    }]);
})();