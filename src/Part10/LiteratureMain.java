package Part10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LiteratureMain {

	public static void main(String[] args) {
		List<Literature> books = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Input Book Name, empty stops");
			String name = reader.nextLine();
			if (name.equals("")) {
				break;
			}
			System.out.println("input age suggestion");
			int age = Integer.parseInt(reader.nextLine());
			Literature book = new Literature(name, age);
			books.add(book);
		}
		
		
		System.out.println(books.size() + " books in total");
		Comparator<Literature> comparator = Comparator
				.comparing(Literature::getAge)
				.thenComparing(Literature::getName);
		Collections.sort(books, comparator);
		System.out.println("Books: ");
		books.stream().forEach(System.out::println);
	}

}
