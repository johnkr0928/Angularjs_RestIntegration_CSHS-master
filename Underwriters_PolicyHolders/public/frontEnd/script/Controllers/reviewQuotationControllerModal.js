
var app = angular.module('insuranceApp');
//app.controller('ModalInstanceCtrl', function ($uibModalInstance, items) {
app.controller('reviewQuotationControllerModal', 
		function($scope, $element, title, obj, close,insuranceService) {

	$scope.name = null;
	$scope.age = null;
	$scope.title = title;
	$scope.showData = obj.content;
	$scope.receivedQuotation = obj.content.quoted;
	$scope.submissionDate =  obj.content.receivedMonth +"-"+ obj.content.receivedDate+"-"+obj.content.receivedYear;
	$scope.lastQuotedDate=	obj.content.quotedMonth +"-"+obj.content.quotedDate +"-"+obj.content.quotedYear;
	$scope.rating = parseInt(obj.content.rating);
	$scope.close = function(valid,updatedStatus) {
		if(valid){
			var ID = $scope.showData.id;
			updateObj ={
					status: updatedStatus
			}
			
			var updateDetailsData = function(content,id){
				return insuranceService.updateQuotedData(content,id);
			}
			
			updateDetailsData(updateObj,ID).then(function(response){
				var object = response.data;
				$scope.result = object;
				console.log($scope.result);
				close({
				      name: $scope.result
				    }, 500);
				$(".modal-backdrop").hide();
				$element.modal('hide');
			});
		}
		
		
	};

	$scope.cancel = function() {
		$(".modal-backdrop").hide();
		//  Manually hide the modal.
		$element.modal('hide');

		
	};

});