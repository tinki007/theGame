(function() {
    var app = angular.module("theGame");
    app.directive("playerDetails", function() {
        return {
            templateUrl: "html/playerDetails.html",
            restrict: "E",
            controllerAs: "playerDetailsCtrl",
            bindToController: true,
            scope: {
                player: '='
            },
            controller:  function() {
                var vm = this;
                console.log("moj player " +   JSON.stringify(vm.player)); //dopytaj czemu ni ma!

                vm.deletePlayer = deletePlayer;
                function deletePlayer(player) {
                    vm.id = player.id;
                }
            }
        };
    });
}());
