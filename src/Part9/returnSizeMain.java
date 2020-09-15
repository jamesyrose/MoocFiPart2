package Part9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class returnSizeMain {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		
		System.out.println(returnSize(names));
		
		Map<String, String> names2 = new HashMap<>();
		names2.put("1", "first");
		names2.put("2", "second");

		System.out.println(returnSize(names2));
		
		Set<String> names3 = new HashSet<>();
		names3.add("first");
		names3.add("first");
		names3.add("second");
		names3.add("second");
		names3.add("second");
		
		System.out.println(returnSize(names3));
	}
	
	public static int returnSize(List<String> names) {
		return names.size();
	}
	
	public static int returnSize(Map<String, String> names) {
		return names.size();
	}
	
	public static int returnSize(Set<String> names) {
		return names.size();
	}

}
