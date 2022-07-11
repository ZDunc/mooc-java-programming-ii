import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> historyList;

    public ChangeHistory() {
        historyList = new ArrayList<>();
    }

    public void add(double status) {
        historyList.add(status);
    }

    public void clear() {
        historyList.clear();
    }

    public String toString() {
        return historyList.toString();
    }

    public double maxValue() {
        return Collections.max(historyList, null);
    }

    public double minValue() {
        return Collections.min(historyList, null);
    }

    public double average() {
        int sum = 0;
        for (double x : historyList) {
            sum += x;
        }
        return (sum * 1.0) / historyList.size();
    }
}
