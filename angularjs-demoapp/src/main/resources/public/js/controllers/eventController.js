'use strict';

eventsApp.controller('eventController', 
  function eventController($scope, eventDataService, $log, $routeParams, $route) {
    
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
    
    $scope.useHttp = true;
    
    eventDataService.getTodaysDate(function(today){
    	$scope.today = today;
    });
    
    $scope.event = eventDataService.getResourceEvent($routeParams.eventId);
    
    // this will log the foo variable value from the url query string. In this case, "bar", 
    // http://localhost:8080/#/event/12?foo=bar
    console.log($route.current.params.foo);

    // This will output the event Id. In this case, 12
    // http://localhost:8080/#/event/12?foo=bar
    console.log($route.current.params.eventId);
    
    // This will output the event Id. Notice that pathParam will not work to access query string parmas such as foo.
    // In this case, 12 is the Event Id from the url below, 
    // http://localhost:8080/#/event/12?foo=bar
    console.log('Event Id using pathParams: ' + $route.current.pathParams.eventId);
    
    /* uses the eventDataServices $http */
    if($scope.useHttp) {

	    // using the callback function
	    /*eventDataService.getEvent(function(event) {
	        $scope.event = event;
	    });*/
	
	    // without using the callback function
    	/*$scope.eventDetails = function() {
		    eventDataService.getEvent($routeParams.eventId)
		    	.success(function(event) {
		    		$scope.event = event;
		    	})
		    	.error(function(data, status, headers, config) {
		    		$log.warn(data, status, headers(), config);
		    	});
    	};	    
    	$scope.eventDetails();*/
    	
       
		
       // using the callback function
	   $scope.upVoteSessionUsingCallbackFunction = function(session) {
	      $scope.isCountZero = false;
	      session.upVoteCount++;
	      eventDataService.addVote(session.id, function(event) {
	    	  $scope.event = event; 
	      });
	    };
	
	    $scope.downVoteSessionUsingCallbackFunction = function(session) {
	      $scope.isCountZero = false;
	      session.upVoteCount--;
	      eventDataService.removeVote(session.id, function(event) {
	    	  $scope.event = event; 
	      });
	    }
	
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
     
     /* using $resource instead of $http */
	} else {
	     eventDataService.getResourceEvent ()
		 	.$promise
		 		.then(function(event) { $scope.event = event; })
			 	.catch(function(response) {
			 		console.log(reponse);
			 	});
	     
	     $scope.upVoteSession  = function (session) {
	       session.upVoteCount++;
	       eventDataService.addResourceVote(session.id)
	     	.$promise
	     		.then(function (event) { $scope.event = event;})	     		
	     		.catch(function (response) {console.log(response); });
		 };
	     
		 $scope.downVoteSession  = function (session) {
		       session.upVoteCount--;
		       eventDataService.removeResourceVote(session.id)
		     	.$promise
		     		.then(function (event) { $scope.event = event;})	     		
		     		.catch(function (response) {console.log(response); });
		};
     }
  });
