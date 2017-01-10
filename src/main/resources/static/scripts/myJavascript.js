/**
 * Created by Piotrek on 06.01.2017.
 */
(function () {
    "use strict";
    var app = angular.module("theGame", []);
    app.controller("firstController", function() {
       this.someVar = "zmieniam jej wartoœæ!";
    });
}());

