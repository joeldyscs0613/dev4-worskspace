'use strict';

eventsApp.controller('editProfileController',
    function editProfileController($scope, gravatarUrlBuilder) {
        $scope.user = {};

        $scope.getGravatarUrl = function(email) {
        	return gravatarUrlBuilder.buildGravatarUrl(email);
        }

    }
);
