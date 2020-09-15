package Part9;

public class CustomTacoBox implements TacoBox {
	private int tacos; 
	public CustomTacoBox(int tacos) {
		this.tacos = tacos;
	}

	@Override
	public int tacosRemaining() {
		return tacos;
	}

	@Override
	public void eat() {
		if (tacos > 0) {
			tacos--;
		}else {
			System.out.println("No More Tacos Left!!!!");
		}
	}

}
