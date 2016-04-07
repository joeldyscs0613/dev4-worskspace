'use strict';

var eventsApp = angular.module('eventsApp', ['ngSanitize', 'ngResource', 'ngRoute'])
				.config(function ($routeProvider) {
					$routeProvider
					.when('/newEvent', 
						{
							templateUrl : 'newEvent.html', 
							controller : 'editEventController', 
						})
				});
