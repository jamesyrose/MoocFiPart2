package Part10;

public class HumanSalaryMain {

	public static void main(String[] args) {
		Human h1 = new Human("bob", 100000);
		Human h2 = new Human("Bill", 10000);
		int x = h1.compareTo(h2);
		System.out.println(x);
	}

}
