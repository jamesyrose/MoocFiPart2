package Part9;

public class Student extends Person {
	private int studyCredits; 

	public Student(String name, String address) {
		super(name, address);
		this.studyCredits = 0;
	}
	
	public void study() {
		studyCredits++;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n     Study Credits " + studyCredits;
	}

}
