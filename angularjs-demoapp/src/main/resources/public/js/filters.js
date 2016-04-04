'use strict';

eventsApp.filter('durations', function() {
	return function(duration) {
		switch (duration) {
			case 1:
				return "1 hour";
			case 2: 
				return "2 hours";
			case 3: 
				return "3 hours";
			case 4:
				return "4 hours";
		}
	}
});

eventsApp.filter('capitalizations', function() {
	return function(creatorName) {
		return creatorName.charAt(0).toUpperCase() + creatorName.substring(1);
	}
});