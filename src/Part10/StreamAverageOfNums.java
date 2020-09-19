package Part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamAverageOfNums {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean cont = true; 
		System.out.println("Input Numbers 'end' will end");
		List<String> outs = new ArrayList<>();
		while (cont) {
			String buf = reader.nextLine();
			if (buf.toLowerCase().trim().equals("end")) {
				cont = false;
			}else {
				outs.add(buf);
			}
		}
		System.out.println("Enter P/N for Average of Positive or negative Numbers");
		String pn  = reader.nextLine();
		double average = 0;
		while (true) { 
			if (pn.toLowerCase().trim().equals("p")) {
				average = outs.stream()
						.mapToInt(s -> Integer.parseInt(s))
						.filter(s -> 0 <= s)
						.average()
						.getAsDouble();
				break;
			}else if (pn.toLowerCase().trim().equals("n")) { 
				average = outs.stream()
						.mapToInt(s -> Integer.parseInt(s))
						.filter(s -> s <=0)
						.average()
						.getAsDouble();
				break;
			} else {
				System.out.println("Enter a valid command");
			}
		}



		System.out.println(average);
	}
}
