package Part9;

public class Cat extends Animal  implements NoiseCapable{

	public Cat() {
		this("Cat");
	}

	public Cat(String name) {
		super(name);
	}
	
	public void purr() {
		System.out.println(super.name + " purr");
	}

	public void makeNoise() {
		this.purr();
	}
}
