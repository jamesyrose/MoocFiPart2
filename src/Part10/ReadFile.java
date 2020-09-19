package Part10;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	
	public static void main(String[] args) {
		String fileName = "./src/Part10/test.txt";
		List<String> file = readFile(fileName);
		file.stream().forEach(System.out::println);
	}
	
	
	public static List<String> readFile(String fileName){
		List<String> rows = new ArrayList<>();

		try {
		    Files.lines(Paths.get(fileName))
		    	.forEach(row -> rows.add(row));
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		}
		return rows;
	}

}
