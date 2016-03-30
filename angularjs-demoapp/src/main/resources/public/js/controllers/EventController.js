'use strict';

eventsApp.controller('EventController', 
  function EventController($scope, eventData) {
    $scope.sortorder = 'name';
    eventData.getEvent(function(event) {
        $scope.event = event;
    })

    $scope.upVoteSession = function(session) {
      session.upVoteCount++;
    };

    $scope.downVoteSession = function(session) {
      session.upVoteCount--;
    }

  });

/*eventsApp.controller('EventController', 
	function EventController($scope, eventData) {
		
		
		eventData.getEvent( function(event) {
			$scope.event = event;
		});
		
		$scope.event = {
					name: "Angular JS", 
					date: "01/01/2016", 
					time: "10:00 AM", 
					location: {
						address: "1500 New York St", 
						city: "Mauntain View", 
						province: "NY"
					}, 
					imageUrl: "/img/angularjs-logo.png"
			
	}
);*/