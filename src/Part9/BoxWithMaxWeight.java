package Part9;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
	private int capacity;
	private int currentWeight;
	private static ArrayList<Item> items;
	
	public BoxWithMaxWeight(int capacity) {
		this.capacity = capacity;
		this.currentWeight = 0;
		this.items = new ArrayList<>();
	}
	
	@Override
	public void add(Item item) {
		if ((item.getWeight() + currentWeight) <= capacity) {
			items.add(item);
			currentWeight += item.getWeight();
		}
	}

	@Override
	public boolean isInBox(Item item) {
		for (Item it: items) {
			if (it.equals(item)) {
				return true;
			}
		}
		return false;
	}
}

