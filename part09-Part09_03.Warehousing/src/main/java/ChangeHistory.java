import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history = new ArrayList<>();
    
    public ChangeHistory() {
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double largest = history.get(0);
        for (Double value : history) {
            if (value > largest) {
                largest = value;
            }
        }
        
        return largest;
    }
    
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double minimum = history.get(0);
        for (Double value : history) {
            if (value < minimum) {
                minimum = value;
            }
        }
        
        return minimum;
    }
    
    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for (Double value : history) {
            sum += value;
        }
        
        double avg = sum / history.size();
        
        return avg;
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
