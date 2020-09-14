package Part8;

import java.util.HashMap;

public class Abbreviations {
	private static HashMap<String, String> abbreviations;

	public Abbreviations() {
		abbreviations = new HashMap<>();
	}
	
	public static void addAbbreviation(String abbreviation, String explanation) {
		abbreviations.put(abbreviation, explanation);
	}
	
	public boolean hasAbbreviation(String abbreviation) {
		for (String key: abbreviations.keySet()) {
			if (abbreviation.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public String findExplanationFor(String abbreviation) {
		return abbreviations.get(abbreviation);
	}
	
	public static void printKeys() {
		for(String key: abbreviations.keySet()) {
			System.out.println(key);
		}
	}
	
	public static void printKeysWhere(String text) {
		for(String key: abbreviations.keySet()) {
			if (key.contains(text)) {
				System.out.println(key);
			}
		}
	}
	
	public static void printValuesOfKeysWhere(String text) {
		for(String key: abbreviations.keySet()) {
			if (key.contains(text)) {
				System.out.println(abbreviations.get(key));
			}
		}
	}
}
