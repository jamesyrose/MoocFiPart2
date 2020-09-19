package Part10;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintUserInput {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> res = new ArrayList<>();
		System.out.println("Enter inputs (empty will end)");
		while (true) {
			String input = reader.nextLine();
			if (input.equals("")) {
				break;
			}else {
				res.add(input);
			}
			
		}
		res.stream().forEach(System.out::println);
	}

}
