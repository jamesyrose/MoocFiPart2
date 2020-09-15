package Part9;

public class OneItemBox extends Box{
	private Item item;

	public OneItemBox() {
	}

	@Override
	public void add(Item item) {
		this.item = item;
		
	}

	@Override
	public boolean isInBox(Item item) {
		if (item.toString().equals(this.item.toString())) {
			return true;
		}else {
			return false;
		}
	}

}
