package Part10;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	private List<Person> allEmployees;
	
	public Employees() {
		this.allEmployees = new ArrayList<>();
	}
	
	public void add (Person person) {
		this.allEmployees.add(person);
	}
	
	public void add(List<Person> peopleToAdd) {
		for (Person person: peopleToAdd) {
			this.allEmployees.add(person);
		}
	}
	
	public void print() {
		for (Person person: this.allEmployees) {
			System.out.println(person);
		}
	}
	
	public void print(Education education) {
		for (Person person: this.allEmployees) {
			if (person.getEducation().equals(education)) {
				System.out.println(person);
			}
		}
	}
	
	public void fire(Education education) {
		for (Person person: this.allEmployees) {
			if (person.getEducation().equals(education)) {
				this.allEmployees.remove(person);
			}
		}
	}
}

