package Part9;

import java.util.ArrayList;

public class MisplacingBox extends Box{
	private int currentWeight;
	private static ArrayList<Item> items;

	public MisplacingBox() {
		this.currentWeight = 0;
		items = new ArrayList<>();
	}
	
	@Override
	public void add(Item item) {
		items.add(item);
		currentWeight += item.getWeight();
	}

	@Override
	public boolean isInBox(Item item) {
		return false;
	}
}
