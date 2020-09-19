package Part12;

public class Hideout<T> {
	private T obj;
	
	public Hideout() {
	}
	
	public void putIntoHideout(T toHide) {
		this.obj = toHide;
	}

	public T takeFromHideout() {
		T buff = this.obj;
		this.obj = null;
		return buff;
	}
	
	public boolean isInHideout() {
		if (this.obj == "null") {
			return true;
		}else {
			return false;
		}
	}
}
