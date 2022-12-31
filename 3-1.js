var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
var McMutability = /** @class */ (function () {
    function McMutability() {
    }
    McMutability.newTotalTime = function (lapTimes) {
        var newLapTimes = __spreadArray([], lapTimes, true);
        newLapTimes.shift();
        var sum = 0;
        for (var _i = 0, newLapTimes_1 = newLapTimes; _i < newLapTimes_1.length; _i++) {
            var x = newLapTimes_1[_i];
            sum += x;
        }
        return sum;
    };
    McMutability.avgTime = function (lapTimes) {
        var time = this.newTotalTime(lapTimes);
        var withoutWarmUp = __spreadArray([], lapTimes, true);
        var laps = withoutWarmUp.length - 1;
        return time / laps;
    };
    return McMutability;
}());
var myNewLapTimes = [31.0, 20.9, 21.1, 21.3];
console.log(McMutability.avgTime(myNewLapTimes));
