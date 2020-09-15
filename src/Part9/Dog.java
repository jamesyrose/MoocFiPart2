package Part9;

public class Dog extends Animal implements NoiseCapable{

	public Dog() {
		this("Dog");
	}
	
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(super.name + " barked");
	}

	public void makeNoise() {
		this.bark();
	}
}
