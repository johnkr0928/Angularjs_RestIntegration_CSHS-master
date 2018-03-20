
var app = angular.module('insuranceApp');
//app.controller('ModalInstanceCtrl', function ($uibModalInstance, items) {
app.controller('bindedControllerModal', 
		function($scope, $element, title, obj, close,insuranceService) {

	$scope.name = null;
	$scope.age = null;
	$scope.title = title;
	$scope.showData = obj.content;
	$scope.receivedQuotation = obj.content.quoted;
	$scope.submissionDate = obj.content.receivedDate +"/"+	obj.content.receivedMonth +"/"+obj.content.receivedYear;
	$scope.lastQuotedDate=obj.content.quotedDate +"/"+	obj.content.quotedMonth +"/"+obj.content.quotedYear;
	$scope.accepetedDate = obj.content.issueDt;
	$scope.cancel = function() {
		$(".modal-backdrop").hide();
		//  Manually hide the modal.
		$element.modal('hide');


	};

});