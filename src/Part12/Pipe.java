package Part12;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
	private List<T> obj;
	
	public Pipe() {
		this.obj = new ArrayList<>();
	}
	
	public void putIntoPipe(T item) {
		this.obj.add(item);
	}

	public T takeFromPipe() {
		if (obj.size() > 0) {
			T item = obj.get(0);
			obj.remove(0);
			return item;
		}
		return null;

	}
	
	public boolean isInPipe() {
		if (this.obj.size() > 0) {
			return true;
		}else {
			return false;
		}
	}
}
