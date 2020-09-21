package Part13;

import java.util.HashMap;

public class Dictionary {
	private HashMap<String, String> dict;

	public Dictionary() {
		this.dict = new HashMap<>();
	}
	
	public String getTranslation(String key) {
		return this.dict.get(key);
	}
	
	public void putTranslation(String key, String trans) {
		this.dict.put(key, trans);
	}
	
	public boolean containsKey(String key) {
		if (this.dict.containsKey(key)) {
			return true;
		}
		return false;
	}
}
