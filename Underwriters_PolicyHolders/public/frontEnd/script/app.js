var app = angular.module("insuranceApp", ["ngRoute","angularModalService","ngAnimate",'datatables']);
// app.controller("myCtrl", function($scope) {
   
// });

app.config(function($routeProvider) {
    $routeProvider
    
    .when("/rateNQoute", {
    	controller: 'rateNQuoteController as rnqCtrl',
    	templateUrl : "frontEnd/views/ratenquote.html"
    })
    .when("/clientReview", {
    	controller: 'clientReviewController as crCtrl',
        templateUrl : "frontEnd/views/clientReview.html"
    })
    .when("/binding", {
    	controller: 'bindingController as bindingCtrl',
        templateUrl : "frontEnd/views/binding.html"
    })
    .when("/enterDetails", {
    	controller: 'enterDetailsController as userCtrl',
        templateUrl : "frontEnd/views/enterDetails.html"
    });
});