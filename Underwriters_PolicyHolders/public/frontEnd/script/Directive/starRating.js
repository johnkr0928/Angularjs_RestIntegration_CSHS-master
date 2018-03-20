angular.module('insuranceApp').directive('starRating',
		function() {
	return {
		restrict : 'A',
		template : '<ul class="rating"><li ng-repeat="star in stars" ng-class="star" ng-click="toggle($index)">'
			+ '  <i class="fa fa-star-o fa-2x" ng-if="!star.filled"></i><i class="fa fa-star fa-2x" ng-if="star.filled"></i>'
			+ ' </li>'
			+ '</ul>',
			scope : {
				ratingValue : '=',
				max : '=',
				onRatingSelected : '&'
			},
			link : function(scope, elem, attrs) {
				var updateStars = function() {
					scope.stars = [];
					for ( var i = 0; i < scope.max; i++) {
						scope.stars.push({
							filled : i < scope.ratingValue
						});
					}

					console.log(elem);
				/*	var liArray = $( elem ).find(".filled");
					for(var j=0;j<liArray.length;j++){
						var i = $(liArray[j]).find('i')[0];					
						$(i).removeClass('fa-star-o');
						$(i).addClass('fa-star');
					}
*/
				};
				updateStars();
				scope.toggle = function(index) {
					scope.ratingValue = index + 1;
					scope.onRatingSelected({
						rating : index + 1
					});
				};

				scope.$watch('ratingValue',
						function(newVal,oldVal) {
					if (newVal) {
						updateStars();
					}
				}
				);
			}
	};
}
);