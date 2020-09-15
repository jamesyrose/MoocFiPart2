package Part9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
 
    private double capacity;
    private double balance;
    private Map<String, Product> productList;
    
    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }
 
        this.balance = 0.0;
        this.productList = new HashMap<>();
    }
    
    public Product takeProduct(String name) {
    	if (productList.keySet().contains(name)) {
    		if (productList.get(name).getStock() != 0) {
        		return productList.get(name);
    		}
    	}
  		return null;
    }
 
    public void addProduct(String name, int price, int amount) {
		if (productList.keySet().contains(name)) {
			for(int i=0; i<amount; i++) {
				productList.get(name).addToStock();
			}
    	}else {
	    	Product newProduct = new Product(name, price, amount);
	    	productList.put(name, newProduct);
    	}
    }
    
    public void addProduct(Product item) {
    	productList.put(item.getName(), item);
    }
    
    public int getPrice(String name) {
    	for (String item: productList.keySet()) {
    		if (item.equals(name)) {
    			return productList.get(item).getPrice();
    		}
    	}
    	return -99;
    }
    
    public int stock(String name) {
    	for (String item: productList.keySet()) {
    		if (item.equals(name)) {
    			return productList.get(item).getStock();
    		}
    	}
    	return 0;
    }
   
    public boolean increaseQuantity(String name) {
    	for (String item: productList.keySet()) {
    		if (item.equals(name)) {
    			productList.get(item).addToStock();
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean take(String name) {
    	for (String item: productList.keySet()) {
    		if (item.equals(name)) {
    			return productList.get(item).takeFromStock();
    		}
    	}
    	return false;
    }
    
    public Set<String> products(){
    	return productList.keySet();
    }
    
    public double getBalance() {
        return this.balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getCapacity() {
        return this.capacity;
    }
 
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }
 
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }
 
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }
 
        this.balance = this.balance - amount;
        return amount;
    }
 
    @Override
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}