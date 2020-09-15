package Part9;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<String, Integer> cart; // product name and quantity
	private int cartPrice = 0;
	
	public ShoppingCart() {
		cart = new HashMap<>();
	}
	
	public boolean add(Product item) {
		if (item.getStock() != 0) {
			if (cart.keySet().contains(item.getName())) {
				cart.replace(item.getName(), cart.get(item.getName()) + 1);
			}else {
				cart.put(item.getName(), 1);
			}
			cartPrice += item.getPrice();
			item.takeFromStock();
			return true;
		}else {
			return false;
		}
	}
	
	public int price() {
		return cartPrice;
	}
	
	public void printCart() {
		System.out.println("\nCurrently In Cart:");
		for (String item: cart.keySet()) {
			System.out.println(item + ": " + cart.get(item));
		}
	}
	
}
