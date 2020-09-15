package Part9;

public abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println(name + " sleeps");
	}
	
	public void eats() {
		System.out.println(name + " eats");
	}
	
	public String getName() {
		return name;
	}
}
