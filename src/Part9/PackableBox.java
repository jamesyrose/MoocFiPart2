package Part9;

import java.util.ArrayList;

public class PackableBox implements Packables{
	
	private ArrayList<Packables> box; 

	public PackableBox(int size) {
		box = new ArrayList<>(size);
	}
	
	public void add(Packables item) {
		box.add(item);
	}
	
	public double weight() {
		double weight  = 0.0;
		for (Packables item: box) {
			weight += item.weight();
		}
		return weight;
	}
	
	@Override
	public String toString() {
		return box.toString();
	}

}
