package Part10;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumberbs {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> res = new ArrayList<>();
		System.out.println("Enter inputs (negative will end)");
		while (true) {
			int input = reader.nextInt();
			if (input < 0) {
				break;
			}else {
				res.add(input);
			}
		}
		res.stream()
			.filter(i -> i > 0 && i < 6)
			.forEach(System.out::println);
	}

}
