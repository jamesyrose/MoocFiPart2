package Part10;

import java.util.ArrayList;
import java.util.Scanner;

import Part9.Person;


public class UniqueNames {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Person> res = new ArrayList<>();
		
		while (true) {
			System.out.println("Continue person information input? 'quit' end");
			String cont = reader.nextLine();
			if (cont.equals("quit")) {
				break;
			}
			System.out.print("Input First Name");
			String name = reader.nextLine();
			System.out.print("Enter Last name");
			String lastName = reader.nextLine();
			System.out.print("Enter Birth Year");
			String birth = reader.nextLine();
			int birthYear = Integer.parseInt(birth);
			Person person = new Person(name, lastName, birthYear);
			res.add(person);
		}
		
		res.stream()
			.map(person -> person.getLastName())
			.sorted()
			.forEach(System.out::println);	
	}

}
