public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory productHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        productHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        productHistory.add(initialBalance);
    }

    public String history() {
        return productHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        productHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double newBalance = super.takeFromWarehouse(amount);
        productHistory.add(super.getBalance());
        return newBalance;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + productHistory.maxValue());
        System.out.println("Smallest amount of product: " + productHistory.minValue());
        System.out.println("Average: " + productHistory.average());
    }
}
