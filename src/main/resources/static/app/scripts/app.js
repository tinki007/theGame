/**
 * Created by Piotrek on 06.01.2017.
 */
(function () {
    "use strict";
    var app = angular.module("theGame", ['ui.bootstrap']);


    app.controller("firstController", function() {
       this.someVar = "zmieniam jej warto��!";
    });

    app.controller("backendController",  function($http) {
        var vm = this;
        
        vm.players = [];
        vm.getPlayers = getPlayers;

        function getPlayers() {
            $http.get("players").then(
                function success(playerData) {
                    angular.copy(playerData.data, vm.players);
                }, 
                function failure() {
                    alert("Players are not here :(");
                }
            );
        }
    });

    app.directive("listOfPlayers", function() {
       return {
            templateUrl: "html/listOfPlayers.html",
            controller: "listOfPlayersController",
            controllerAs: "playersCtrl"
       };
    });

    app.controller("listOfPlayersController", function($http) {
        var vm = this;
        vm.players = [];
        vm.zmienna = "zmienna";
        vm.deletePlayer = deletePlayer;

        function deletePlayer(player) {
            vm.id = player.id;
        };

        var init = function() {
            $http.get("players").then(
                function success(playerData) {
                    angular.copy(playerData.data, vm.players);
                },
                function failure() {
                    alert("Players are not here :(");
                }
            );
        };
        init();
    });

}());

