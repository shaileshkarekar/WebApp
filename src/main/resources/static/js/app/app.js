'use strict'
var demoApp = angular.module('app', [ 'ui.bootstrap', 'app.controllers',
		'app.services' ]);
demoApp.constant("CONSTANTS", {
	getAllEmployees : "/App/employee/getAllEmployees",
	saveEmployee : "/App/employee/saveEmployee"
});
