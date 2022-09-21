public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        double result = (double) super.getBalance() + amount;
        super.addToWarehouse(amount);
        history.add(result);
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double result = (double) super.getBalance() - amount;
        history.add(result);
        
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + history.toString());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
