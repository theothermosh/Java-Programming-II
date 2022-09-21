import java.util.*;

public class IOU {
    private HashMap<String, Double> table = new HashMap<>();
    
    public IOU() {
    }
    
    public void setSum(String toWhom, double amount) {
        table.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return table.getOrDefault(toWhom, 0.0);
    }
}
