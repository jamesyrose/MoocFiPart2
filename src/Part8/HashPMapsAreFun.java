package Part8;

import java.util.HashMap;

public class HashPMapsAreFun {

	public static void main(String[] args) {

	}
	
	public static void nicknameHashMap() {
		HashMap<String, String> nicknames = new HashMap<>();
		nicknames.put("matthew", "matt");
		nicknames.put("micahel", "mike");
		nicknames.put("arthur", "artie");
		System.out.println(nicknames.get("matthew"));
	}
	
	// first thing at hashmapss
	public static void preTest() {
		HashMap<String, Integer> conversionMap = new HashMap<>();
		conversionMap.put("3", 9);
		conversionMap.put("6", 6);
		conversionMap.put("9", 3);
		
		if (conversionMap.get("9") == 3) {
			System.out.println("Correct");
		}
	}

}
