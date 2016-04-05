'use strict';

eventsApp.controller('eventController', 
  function eventController($scope, eventDataService, $log) {
    
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
    
    // using the callback function
    /*eventDataService.getEvent(function(event) {
        $scope.event = event;
    });*/

    // without using the callback function
    eventDataService.getEvent()
    	.success(function(event) {
    		$scope.event = event;
    	})
    	.error(function(data, status, headers, config) {
    		$log.warn(data, status, headers(), config);
    	});
    
    
	// using the callback function
   /* $scope.upVoteSession = function(session) {
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
    }*/

	// without using the callback function
     $scope.upVoteSession = function(session) {
       session.upVoteCount++;
       eventDataService.addVote(session.id)
       	.success(function(event){ $scope.event = event;})
    	.error(function(data, status, headers, config) {
    		$log.warn(data, status, headers(), config);
    	});
     };

     $scope.downVoteSession = function(session) {
       session.upVoteCount--;
       eventDataService.removeVote(session.id)
       		.success(function(event) { $scope.event = event;})
        	.error(function(data, status, headers, config) {
        		$log.warn(data, status, headers(), config);
        	});
     };
  });
