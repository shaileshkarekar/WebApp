'use strict'

var module = angular.module('app.controllers', []);

module.controller("EmployeeController", ["$scope", "EmployeeService",

    function($scope, EmployeeService) {

        $scope.employeeDto = {

        		employeeId: null,

        		employeeName: null,

        };
        
$scope.saveEmployee = function() {
        

                console.log($scope.employeeDto);
				EmployeeService.saveEmployee($scope.employeeDto)
				  $scope.allEmployees = EmployeeService.getAllEmployees();
				  
				   $scope.employeeDto = {

                    employeeId: null,

                    employeeName: null,

                    /* skillDtos: [] */

                };
				
}

        
        
  }]);

