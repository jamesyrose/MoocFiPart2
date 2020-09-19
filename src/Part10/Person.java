package Part10;

public class Person {
	private String name; 
	private Education edu; 

	public Person(String name, Education edu) {
		this.name = name; 
		this.edu = edu;
	}
	
	public String getName() {
		return this.name;
	}

	public Education getEducation() {
		return this.edu;
	}
	
	@Override
	public String toString() {
		return this.name + " has " + this.edu + " education";
	}
}
