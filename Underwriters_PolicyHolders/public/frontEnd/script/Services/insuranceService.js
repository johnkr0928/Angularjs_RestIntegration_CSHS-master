var app = angular.module("insuranceApp");
app.service('insuranceService',['$http',function($http){
	var newAccountDetailsArray=[];
	var balDetails={};
	this.getAll = function(data){
		var promise = $http.get('http://localhost:8080/Client_StackHolder_System/cshs/viewAllClientRequestByStatus/'+data);
		return promise;
	};
	
	this.postData = function(data){
		var promise = $http.post('http://localhost:8080/Client_StackHolder_System/cshs/submitClientRequest',data);
		return promise;
	}
	
	this.updateQuotedData = function(data,id){
		var promise = $http.put('http://localhost:8080/Client_StackHolder_System/cshs/updateSubmittedClientRequest/'+id,data);
		return promise;
	}
	
	
}]);