class Mutability {
    static newTotalTime(lapTimes: Array<number>): number {
        let newLapTimes = [...lapTimes]
        newLapTimes.shift();
        let sum = 0;
        for (let x of newLapTimes) {
            sum += x;
        }
        return sum;
    }

    static avgTime(lapTimes: Array<number>): number {
        let time = this.newTotalTime(lapTimes);
        let withoutWarmUp: Array<number> = [...lapTimes];
        let laps = withoutWarmUp.length - 1;
        return time / laps;
    }
}

const myLapTimes = [31.0, 20.9, 21.1, 21.3]

console.log(Mutability.avgTime(myLapTimes))
