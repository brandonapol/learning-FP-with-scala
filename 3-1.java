import java.util.List;

class mutability {
    static double totalTime(List<Double> lapTimes) {
        lapTimes.remove(0);
        double sum = 0;
        for (double x : lapTimes) {
            sum += x;
        }
        return sum;
    }

    static double avgTime(List<Double> lapTimes) {
        double time = totalTime(lapTimes);
        int laps = lapTimes.size();
        return time / laps;
    }
}
