package Part9;

import java.util.Scanner;

public class WarehouseProductMain {

	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse(1000);
		warehouse.addProduct("coffee", 5, 1);

		System.out.println("stock:");
		System.out.println("coffee:  " + warehouse.stock("coffee"));
		System.out.println("sugar: " + warehouse.stock("sugar"));

		System.out.println("taking coffee " + warehouse.take("coffee"));
		System.out.println("taking coffee " + warehouse.take("coffee"));
		System.out.println("taking sugar " + warehouse.take("sugar"));

		System.out.println("stock:");
		System.out.println("coffee:  " + warehouse.stock("coffee"));
		System.out.println("sugar: " + warehouse.stock("sugar"));
		
		warehouse.addProduct("milk", 3, 10);
		warehouse.addProduct("coffee", 5, 6);
		warehouse.addProduct("buttermilk", 2, 20);
		warehouse.addProduct("yogurt", 2, 20);

		System.out.println("\n\nproducts:");

		for (String product: warehouse.products()) {
		    System.out.println(product);
		}
		
		ShoppingCart cart = new ShoppingCart();
		cart.add(warehouse.takeProduct("milk"));
		cart.add(warehouse.takeProduct("coffee"));
		cart.add(warehouse.takeProduct("coffee"));
		System.out.println("Cart Price: $" + cart.price());
		cart.printCart();
		
		Store store = new Store(warehouse, new Scanner(System.in));
		store.shop("Me");
	}
}
