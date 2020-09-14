package Part8;

import java.util.ArrayList;
import java.util.HashMap;

public class DictOfManyTranslations {
	private static HashMap<String, ArrayList<String>> dict;
	
	public DictOfManyTranslations() {
		this.dict = new HashMap<>();
	}
	
	public void add(String word, String trans) {
		if (dict.keySet().contains(word)) {
			dict.get(word).add(trans);
		}else {
			dict.put(word, new ArrayList<>());
			dict.get(word).add(trans);
		}
	}

	public ArrayList<String> translate(String word){
		if (dict.keySet().contains(word)) {
			return dict.get(word);
		}else {
			return new ArrayList<>();
		}
	}
	
	public void remove(String word) {
		if (dict.keySet().contains(word)) {
			dict.remove(word);
		}else {
			System.out.println("Key not in Dictionary");
		}
	}
}
