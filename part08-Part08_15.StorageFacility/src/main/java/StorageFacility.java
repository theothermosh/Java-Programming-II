import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> items;

    public StorageFacility() {
        items = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        items.putIfAbsent(unit, new ArrayList<>());
        items.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return items.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        items.get(storageUnit).remove(item);
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList units = new ArrayList<>();
        for (String unit : items.keySet()) {
            if (!(items.get(unit).isEmpty())) {
                units.add(unit);
            }
        }
        
        return units;
    }
}
