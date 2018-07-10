'use strict'

var module = angular.module('app.controllers', []);

module.controller("EmployeeController", ["$scope", "EmployeeService",

    function($scope, EmployeeService) {

        $scope.employeeDto = {

        		employeeId: null,

        		employeeName: null,

        };
        
        EmployeeService.saveEmployee($scope.employeeDto).then(function() {

                console.log("works");

                EmployeeService.getAllEmployees().then(function(value) {

                    $scope.allEmployees = value.data;

                }, function(reason) {

                    console.log("error occured");

                }, function(value) {

                    console.log("no callback");

                });

                /* $scope.skills = []; */

                $scope.employeeDto = {

                    employeeId: null,

                    employeeName: null,

                    /* skillDtos: [] */

                };

            }, function(reason) {

                console.log("error occured");

            }, function(value) {

                console.log("no callback");

            });

        }

    }

]);

