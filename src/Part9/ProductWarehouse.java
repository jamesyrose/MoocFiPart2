package Part9;

public class ProductWarehouse extends Warehouse{
	String productName;

	public ProductWarehouse(String productName, double capacity) {
		super(capacity);
		this.productName = productName;
	}
	
	public String getName() {
		return productName;
	}
	
	@Override
	public String toString() {
		return productName + " " + super.toString();
	}
}
