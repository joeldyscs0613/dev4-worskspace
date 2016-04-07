'use strict';

var eventsApp = angular.module('eventsApp', ['ngSanitize', 'ngResource', 'ngRoute'])
		.config(function ($routeProvider, $locationProvider) {
			$routeProvider .when('/newEvent', {
					templateUrl : 'templates/newEvent.html', 
					controller : 'editEventController', 
			});
			
			$routeProvider .when('/events', {
				templateUrl : 'templates/eventList.html', 
				controller : 'eventListController', 
			});
			
			$routeProvider .when('/event/:eventId', {
				templateUrl : 'templates/eventDetails.html', 
				controller : 'eventController', 
			});
			
			/*$routeProvider .otherwise({
				redirectTo : '/events'
			});*/
			
			// This is to get rid of the # in the url when routing
			//$locationProvider.html5Model(true);
			
		});
