'use strict'

angular.module('app.services', []).factory('EmployeeService', ["$http", function($http) {

    var service = {};

    /*service.getUserById = function(userId) {

        var url = CONSTANTS.getUserByIdUrl + userId;

        return $http.get(url);

    }
*/
    service.getAllEmployees = function() {

        return $http.get(employees);

    }

    service.saveEmployee = function(employeeDto) {

        return $http.post(employees, employeeDto);

    }

    return service;

}]);