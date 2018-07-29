'use strict'

angular.module('app.services', []).factory('EmployeeService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {

			var service = {};

			service.getAllEmployees = function() {

				return $http.get(CONSTANTS.getAllEmployees);

			}

			service.saveEmployee = function(employeeDto) {
                console.log("save employee")
				return $http.post(CONSTANTS.saveEmployee, employeeDto);

			}

			return service;

		} ]);