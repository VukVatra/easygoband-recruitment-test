(function() {
	'use strict';

	angular.module('providers.module', []).controller(
			'ProvidersController', ProvidersController);

	function ProvidersController($scope, $http, $timeout, $window) {

		var self = this;
		$scope.sessions = [];
		$scope.selectedSession = null;
		
		$scope.init = function() {
			
			$http.get('provider/getAll').success(function(data) {
				$scope.sessions = data;
				
				$scope.sessions.sort(function(a, b) {
					var ai = parseInt(a.sessionName.substring(0,2));
					var bi = parseInt(b.sessionName.substring(0,2));
					return ai - bi;
				});
				
			});
			
		};
		
		$scope.selectSession = function(s){
			$scope.selectedSession = s;
		}
		
		$scope.init();

	}

})();