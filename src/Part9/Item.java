package Part9;

public class Item {
	private String name;
	private int weight;
	
	public Item(String name) {
		this(name, 0);
	}
	
	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object.toString().equals(this.toString())) {
			return true;
		}else {
			return false;
		}
	}

	
	@Override
	public String toString() {
		return name;
	}
}
