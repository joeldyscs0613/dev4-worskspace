'use strict'

eventsApp.factory('httpService', function($http, $log, $resource) {
    
	return {
	
		httpPost : function (dataObject) {
			return $http({ method: 'POST', url: 'event/data/add', data: dataObject});
		}, 
		
		httpGet : function (dataObject) {
			return $http({ method: 'GET', url: 'event/data/get/'});
		},
		
		httpGetById : function (dataObject) {
			return $http({ method: 'GET', url: 'event/data/get/' + dataObject.id});
		}, 
		
		
		httpPost : function (dataObject) {
			return $http({ method: 'PUT', url: 'event/data/update', data: dataObject});
		}/*, 
		
		httpPost : function (dataObject) {
			return $http({ method: 'POST', url: 'event/data/delete', data: dataObject});
		}*/
		
		var req = {
				 method: 'POST',
				 url: 'http://example.com',
				 headers: {
				   'Content-Type': undefined
				 },
				 data: { test: 'test' }
				}
    }
});