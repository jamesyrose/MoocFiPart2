package Part9;

public class TripleTacoBox implements TacoBox {
	private int tacos; 

	public TripleTacoBox() {
		this.tacos = 3;
	}

	@Override
	public int tacosRemaining() {
		return  tacos;
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
