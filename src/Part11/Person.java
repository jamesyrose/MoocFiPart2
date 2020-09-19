package Part11;

public class Person {
	private String name; 
	private int age;
	
	public Person(String name, int age) {
		if (name.isEmpty() | name.length() < 40 | name != null) {
			throw new IllegalArgumentException("Name is invalid");
		}else if (age > 120 | age < 0) {
			throw new IllegalArgumentException("Age is invalid");
		}
		this.name = name;
		this.age = age;
	}
}
