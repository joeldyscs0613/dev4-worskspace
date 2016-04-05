eventsApp.factory('eventDataService', function($http, $log) {
    return {
    	
    	// getEvent function using the successcb callback function
        /*getEvent: function(successcb) {
            $http({method: 'GET', url: '/data/event/1'}).
                success(function(data, status, headers, config) {
                    successcb(data)
                }).
                error(function(data, status, headers, config) {
                    $log.warn(data, status, headers(), config);
                });
        },*/
        
    	// getEvent function without using the successcb callback function
        getEvent: function() {
             return $http({method: 'GET', url: '/data/event/1'});
        },
        
        addVote: function(sessionId, successcb) {
             return $http({method: 'PUT', url: '/data/event/addVote/'+sessionId});
        },
        
        removeVote: function(sessionId, successcb) {
            $http({method: 'PUT', url: '/data/event/removeVote/'+sessionId});
        }, 
        
        getTodaysDate: function(todaysDate) {
        	todaysDate(new Date());
        }, 
        
    	getSortOrder: function(event, sortOrder) {
    		var sessions = event.sessions;
    		var isVoteCountZero = true;
    		for(var i=0; sessions.length; i++) {
    			if(sessions[i].upCountVote>0) {
    				isVoteCountZero = false;
    			}
    		}
    		var sOrder = 'name';
    		if(!isVoteCountZero) {
    			sOrder = '-upVoteCount';
    		}
    		sortOrder(sOrder);
    	}
    };
});