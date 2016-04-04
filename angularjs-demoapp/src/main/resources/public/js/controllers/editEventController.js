'use strict'

eventsApp.controller('editEventController', function editEventController($scope) {

	$scope.saveEvent = function (event) {
		window.alert('Event ' + event.name + ' saved!');
	};
	
	$scope.cancelEdit = function () {
		window.location = "/eventDetails.html";
	};
});