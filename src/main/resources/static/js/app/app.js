'use strict'
var demoApp = angular.module('app', [ 'ui.bootstrap', 'app.controllers',
		'app.services' ]);
demoApp.constant("CONSTANTS", {
	getAllEmployees : "/employee/getAllEmployees",
	saveEmployee : "/employee/saveEmployee"
});
