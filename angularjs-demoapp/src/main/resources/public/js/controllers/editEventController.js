'use strict'

eventsApp.controller('editEventController', function editEventController($scope, eventDataService) {

	$scope.saveEventWithPromise = function (event, newEventForm) {
		if(newEventForm.$valid) { 
			eventDataService.saveResourceEvent(event)
			.$promise
			.then(function (response) {console.log('sucess', response);})
			.catch( function (response) {console.log('failure', response);})
		}
	};
	
	$scope.saveEvent = function (event, newEventForm) {
		if(newEventForm.$valid) {
			console.log('success', eventDataService.saveEvent(event));
		}
	};
	
	$scope.cancelEdit = function () {
		window.location = "/eventDetails.html";
	};
});