package Part9;

public class Product {
	private String name; 
	private int price; 
	private int stock;

	public Product(String name, int price) {
		this(name, price, 0);
	}
	
	public Product(String name, int price, int stock) {
		this.name = name; 
		this.price = price;
		this.stock = stock;
	}
	
	public void addToStock() {
		stock++;
	}
	
	public boolean takeFromStock() {
		if (stock != 0 ) {
			stock--;
			return true;
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		if (price == 0) {
			return -99;
		}
		return price; 
	}
	
	public int getStock() {
		return stock;
	}
	
	@Override
	public String toString() {
		return name + ": " + stock;
	}

}
