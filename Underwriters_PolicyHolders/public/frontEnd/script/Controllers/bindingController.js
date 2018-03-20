var app = angular.module("insuranceApp");
app.controller("bindingController",function($scope,$controller,ModalService, insuranceService, DTOptionsBuilder, DTColumnDefBuilder){
	$controller('mainController', {$scope: $scope}); 
	this.progressValue=100;
	$scope.dtOptions = DTOptionsBuilder.newOptions()
    .withDisplayLength(10)
    .withOption('bLengthChange', false);
	
	$scope.dtColumnDefs = [
		 DTColumnDefBuilder.newColumnDef(7).notSortable(),
		   DTColumnDefBuilder.newColumnDef(8).notSortable()
		];
	getBinding=function(data){

		return insuranceService.getAll(data);

	};
	getBinding('BINDED').then(function(response){
		var object = response.data;
		$scope.result = object;
	});

	this.showDetailsById = function(id) {
	
		ModalService.showModal({
			templateUrl: "frontEnd/views/bindedModal.html",
			controller: "bindedControllerModal",
			inputs: {
				title: "View Policy",
				obj: {
					content: id
				}
			}
		}).then(function(modal) {
			modal.element.modal();
			modal.close.then(function(result) {
				//getAllData();
			});
		});
	};

});