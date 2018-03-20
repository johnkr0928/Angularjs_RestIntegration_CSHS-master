var app = angular.module("insuranceApp");
app.controller("rateNQuoteController",function($scope,$controller,ModalService, insuranceService, DTOptionsBuilder, DTColumnDefBuilder){
	$controller('mainController', {$scope: $scope}); 
	this.progressValue=50;
	
	$scope.dtOptions = DTOptionsBuilder.newOptions()
    .withDisplayLength(10)
    .withOption('bLengthChange', false);
	
	$scope.dtColumnDefs = [
		   DTColumnDefBuilder.newColumnDef(8).notSortable()
		];
	
	
	getRateNQoute=function(data){

		return insuranceService.getAll(data);

	}
	var getAllData= function(){
		getRateNQoute('UNREVIEWED').then(function(response){
			var object = response.data;
			$scope.resultReviewed = object;
			console.log($scope.resultReviewed );
		});

		getRateNQoute('REJECTED').then(function(response){
			var object = response.data;
			$scope.resultRejected = object;
		});
	}
	getAllData();
	this.showDetailsById = function(id) {
		//insuranceService.getAll();

		ModalService.showModal({
			templateUrl: "frontEnd/views/rateNQuoteModal.html",
			controller: "rateNQuoteControllerModal",
			inputs: {
				title: "Rate & Quote Submission",
				obj: {
					content: id
				}
			}
		}).then(function(modal) {
			modal.element.modal();
			modal.close.then(function(result) {
				console.log(result);
				getAllData();
			});
		});
	};
});