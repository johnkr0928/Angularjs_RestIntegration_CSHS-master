var app = angular.module("insuranceApp");
app.controller("clientReviewController",function($scope,$controller,ModalService, insuranceService, DTOptionsBuilder, DTColumnDefBuilder){
	$controller('mainController', {$scope: $scope});
	this.progressValue=67;
	
	$scope.dtOptions = DTOptionsBuilder.newOptions()
    .withDisplayLength(10)
    .withOption('bLengthChange', false);
	
	$scope.dtColumnDefs = [
		 DTColumnDefBuilder.newColumnDef(6).notSortable(),
		   DTColumnDefBuilder.newColumnDef(7).notSortable()
		];
	
	getRateNQoute=function(data){

		return insuranceService.getAll(data);

	}
	getRateNQoute('QUOTED').then(function(response){
		var object = response.data;
		$scope.result = object;
	});
	
	
	this.showDetailsById = function(id) {
		//insuranceService.getAll();

		ModalService.showModal({
			templateUrl: "frontEnd/views/reviewQuotationModal.html",
			controller: "reviewQuotationControllerModal",
			inputs: {
				title: "Review Received Quote & Accept",
				obj: {
					content: id
				}
			}
		}).then(function(modal) {
			modal.element.modal();
			modal.close.then(function(result) {
				console.log(result);
				getRateNQoute('QUOTED').then(function(response){
				$scope.result = response.data;
	});
			});
		});
	};
});