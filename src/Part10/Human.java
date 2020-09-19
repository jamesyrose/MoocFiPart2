package Part10;

public class Human implements Comparable<Human> {
	private String name; 
	private int salary;

	public Human(String name, int salary) {
		this.name = name; 
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public int compareTo(Human human) {
		System.out.println(this.salary);
		System.out.println(human.getSalary());
		if (this.salary == human.getSalary()) {
			return 0;
		} else if (this.salary < human.getSalary()) {
			return -1;
		} else {
			return 1;
		}
	}

}
