'use strict';

eventsApp.controller('eventController', 
  function EventController($scope, eventDataService) {
    
    $scope.snippest = '<span style="color:red">Hi there!</span>'
    $scope.showBoolVal = true;
    $scope.myStyle = {color: 'red'};
    $scope.myClass = "blue";
    $scope.buttonDisabled;
    $scope.sortOrder = 'name';
    $scope.limitTo = 'all';
   // $scope.query = 'All';
    
    // Other Angular ng directives
    $scope.ngClassOdd;
    $scope.ngClassEven;
    $scope.ngChecked = false;
    $scope.ngSelected = false;
    $scope.ngMultiple = false;
    $scope.ngReadonly = false;
    $scope.isCountZero = true;
    
    eventDataService.getTodaysDate(function(today){
    	$scope.today = today;
    });
    
    eventDataService.getEvent(function(event) {
        $scope.event = event;
    });

	
    $scope.upVoteSession = function(session) {
      $scope.isCountZero = false;
      session.upVoteCount++;
      eventDataService.addVote(session.id, function(event) {
    	  $scope.event = event; 
      });
    };

    $scope.downVoteSession = function(session) {
      $scope.isCountZero = false;
      session.upVoteCount--;
      eventDataService.removeVote(session.id, function(event) {
    	  $scope.event = event; 
      });
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