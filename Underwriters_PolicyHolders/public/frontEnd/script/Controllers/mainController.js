var app = angular.module("insuranceApp");
app.controller("mainController",['$scope','insuranceService',function($scope,insuranceService){
	
	this.home = function(){
		this.isFormOpen=true;
		this.isClient=false;
		this.isUnderWriter=false;
	}
	this.home();
	this.showClient = function(){
		this.isFormOpen=false;
		this.isClient=true;
	
		this.isUnderWriter=false;
	};
	
	this.showUnderwriter = function(){
		
		this.isClient=false;
		this.isFormOpen=false;
		this.isUnderWriter=true;
	};
}]);