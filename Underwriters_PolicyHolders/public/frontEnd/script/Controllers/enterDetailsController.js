var app = angular.module("insuranceApp");
app.controller("enterDetailsController",function($scope,$controller,insuranceService){
	$controller('mainController', {$scope: $scope});
	this.progressValue=33;
	this.reset=function(){
		this.user.agentCode = null;
		this.user.agentContact =null;
		this.user.agentName =null;
		this.user.parentAgentName=null;
		this.user.parentAgentCode=null;
		this.user.businessUnitName=null;
		this.user.operatingUnitName=null;
		this.user.previousPolicyNumber=null;
		this.user.insuredName=null;
		$scope.detailsForm.$setPristine();
	}
	this.getDetails = function(valid){
		if(valid){
			var obj ={

					agentCode:	this.user.agentCode,
					agentContact:	this.user.agentContact,
					agentName:	this.user.agentName,
					parentAgentName:	this.user.parentAgentName,
					parentAgentCode:	this.user.parentAgentCode,
					businessUnitName:	this.user.businessUnitName,
					operatingUnitName:	this.user.operatingUnitName,
					previousPolicyNum:	this.user.previousPolicyNumber,
					insuredName:	this.user.insuredName,
					status: "UNREVIEWED"

			}	
			this.reset();
			console.log(obj);
			var enterDetailsData = function(content){
				return insuranceService.postData(content);
			}
			enterDetailsData(obj).then(function(response){
				var object = response.data;
				$scope.result = object.message;
				
				console.log($scope.result);
			});

		}
	}
});