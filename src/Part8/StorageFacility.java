package Part8;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
	private static HashMap<String, ArrayList<String>> storage; 

	public StorageFacility() {
		storage = new HashMap<>();
	}
	
	public void add(String unit, String item) {
		if (storage.keySet().contains(unit)) {
			if (!storage.get(unit).contains(item)) {		
				storage.get(unit).add(item);
			}
		}else {
			storage.put(unit, new ArrayList<>());
			storage.get(unit).add(item);
		}
	}
	
	public ArrayList<String> contents(String storageUnit){
		if(storage.keySet().contains(storageUnit)) {
			return storage.get(storageUnit);
		}else {
			return new ArrayList<>();
		}
	}
	
	public void remove(String unit, String item) {
		if (storage.keySet().contains(unit)) {
			storage.get(unit).remove(item);
		}
	}
	
	
	public ArrayList<String> storageUnits(){
		ArrayList<String> keys = new ArrayList<>();
		for (String key: storage.keySet()) {
			keys.add(key);
		}
		return keys;
	}
}
