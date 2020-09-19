package Part10;

public class Student implements Comparable<Student> {
	private String name;
	
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Student student) {
		int compare = this.name.compareTo(student.getName());
		if (compare > 0) {
			return 1;
		} else if (compare < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
