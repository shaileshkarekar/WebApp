'use strict'
var demoApp = angular.module('demo', [ 'ui.bootstrap', 'app.controllers',
		'app.services' ]);
demoApp.constant("CONSTANTS", {
	getAllEmployees : "/employee/getAllEmployees",
	saveEmployee : "/employee/saveEmployee"
});
