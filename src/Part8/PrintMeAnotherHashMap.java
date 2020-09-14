package Part8;

import java.util.HashMap;

public class PrintMeAnotherHashMap {
	private static HashMap<String, Book> library;

	public static void main(String[] args) {
		library = new HashMap<>();
		library.put("sense", new Book("Sense and Sensibility", 1811, "..."));
		library.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

		printValues(library);
		System.out.println("---");
		printValueIfNameContains(library, "prejud");
	}
	
	public static void printValues(HashMap<String, Book> hashmap) {
		for (String key: hashmap.keySet()) {
			System.out.println(hashmap.get(key).toString());
		}
	}
	
	public static void printValueIfNameContains(HashMap<String, Book> hashmap, String name) {
		for (String key: hashmap.keySet()) {
			if(key.contains(name)) {
				System.out.println(hashmap.get(key).toString());
			}
		}
	}

}
