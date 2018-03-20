
var app = angular.module('insuranceApp');
//app.controller('ModalInstanceCtrl', function ($uibModalInstance, items) {
app.controller('rateNQuoteControllerModal', 
		function($scope, $element, title, obj, close,insuranceService) {

	$scope.name = null;
	$scope.age = null;
	$scope.title = title;
	$scope.showData = obj.content;
	$scope.submissionDate = obj.content.receivedMonth +"-"+	obj.content.receivedDate +"-"+obj.content.receivedYear;
	$scope.lastQuotedDate=obj.content.quotedMonth +"-"+	obj.content.quotedDate +"-"+obj.content.quotedYear;
	//var rejDt = new Date(obj.content.rejectedDate);

	$scope.rejectedDate =obj.content.rejectedDate;
	$scope.showRatingError = false;
	$scope.showQuotationError = true; 	
	if(obj.content.rating){
		$scope.rating = obj.content.rating;
	}else{
		$scope.rating = 0;
	}
	$scope.quotation=obj.content.quoted;
	$scope.rateFunction = function(rating) {
		$scope.showRatingError = false;
	};

	//  This close function doesn't need to use jQuery or bootstrap, because
	//  the button has the 'data-dismiss' attribute.
	$scope.submitForm = function(valid) {
		if($scope.rating>0 && valid){
			$scope.showRatingError = false;
			$scope.showQuotationError = true; 	
			var ID = $scope.showData.id;
			updateObj ={
					quoted: $scope.quotation,
					rating: $scope.rating,
					status: "QUOTED"
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
		} else {
			if($scope.rating==0){
				$scope.showRatingError = true; 			
			}
			if(!valid){
				$scope.showQuotationError = false; 	
			}}


	};

	//  This cancel function must use the bootstrap, 'modal' function because
	//  the doesn't have the 'data-dismiss' attribute.
	$scope.cancel = function() {
		$(".modal-backdrop").hide();
		//  Manually hide the modal.
		$element.modal('hide');


	};

});