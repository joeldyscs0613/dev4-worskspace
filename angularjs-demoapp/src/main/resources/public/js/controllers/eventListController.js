'use strict'

eventsApp.controller('eventListController', 
		function eventListController ($scope, eventDataService) {
			$scope.events = [];
			eventDataService.getAllEvents()
				.success(function (events) { $scope.events = events; })
				.error( function (data, status, headers, config) { consoler.log(data, status, headers, config)});			
		}
);