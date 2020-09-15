package Part9;

import java.util.ArrayList;

public class Herd implements Moveable {
	private ArrayList<Moveable> herd;

	public Herd() {
		this.herd = new ArrayList<>();
	}
	
	public void addToHerd(Moveable moveable) {
		herd.add(moveable);
	}

	@Override
	public void move(int dx, int dy) {
		for (Moveable moveable: herd) {
			moveable.move(dx,  dy);
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		for (Moveable moveable: herd) {
			str = str + moveable.toString() + "\n";
		}
		return str;
	}

}
