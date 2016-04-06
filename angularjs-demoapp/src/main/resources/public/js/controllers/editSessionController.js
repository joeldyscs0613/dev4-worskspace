'use strict'

eventsApp.controller('editSessionController',
		function editSessionController ($scope, eventDataService) {
	
	/*$scope.saveEventWithPromise = function (event, newEventForm) {
		if(newEventForm.$valid) { 
			eventDataService.saveResourceEvent(event)
			.$promise
			.then(function (response) {console.log('sucess', response);})
			.catch( function (response) {console.log('failure', response);})
		}
	};*/
	
	$scope.saveSession = function (session, newSessionForm) {
		if(newSessionForm.$valid) {
			console.log('success', eventDataService.saveSession(session));
		}
	};
	
	$scope.cancelEdit = function () {
		window.location = "/eventDetails.html";
	};
});
