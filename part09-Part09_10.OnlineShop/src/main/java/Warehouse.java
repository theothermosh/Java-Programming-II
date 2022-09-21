import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productsAndPrices;
    private Map<String, Integer> productsAndStock;

    public Warehouse() {
        productsAndPrices = new HashMap<>();
        productsAndStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productsAndPrices.put(product, price);
        productsAndStock.put(product, stock);
    }
    
    public int price(String product) {
        return productsAndPrices.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return productsAndStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (stock(product) > 0) {
            int curStock = productsAndStock.get(product);
            productsAndStock.put(product, curStock - 1);
            
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set productSet = new HashSet<>();
        for (String product : productsAndPrices.keySet()) {
            productSet.add(product);
        }
        
        return productSet;
    }
}
