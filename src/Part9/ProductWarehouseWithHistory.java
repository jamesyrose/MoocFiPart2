package Part9;

public class ProductWarehouseWithHistory extends ProductWarehouse {
	private static ChangeHistory history;
	
	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		super.addToWarehouse(initialBalance);
		history = new ChangeHistory();
		history.add(super.getBalance());
	}

	@Override 
    public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		history.add(super.getBalance());
	}
	
	@Override 
    public double takeFromWarehouse(double amount) {
		if (amount < super.getBalance()) {
			super.takeFromWarehouse(amount);
			history.add(super.getBalance());
			return amount;
		}else {
			history.add(super.getBalance());
			return (double) 0.0;
		}
	}
	
	public void printAnalysis() {
		System.out.println("Average: " + history.average());
	}
	
	public String history() {
		return history.toString();
	}
}
