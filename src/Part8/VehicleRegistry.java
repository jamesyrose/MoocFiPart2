package Part8;

import java.util.HashMap;

public class VehicleRegistry {
	private static HashMap<String, LicensePlate> registry;

	public VehicleRegistry() {
		this.registry = new HashMap<>();
	}
	
	public boolean add(LicensePlate lp, String owner) {
		for (String key: registry.keySet()) {
			if (lp.equals(registry.get(key))) {
				return false;
			}
		}
		registry.put(owner, lp);
		return true;
	}
	
	public String get(LicensePlate lp) {
		for (String key: registry.keySet()) {
			if (lp.equals(registry.get(key))) {
				return key;
			}
		}
		return null;
	}
	
	public boolean remove(LicensePlate lp) {
		for (String key: registry.keySet()) {
			if (lp.equals(registry.get(key))) {
				registry.remove(key);
				return true;
			}
		}
		return false;	
	}
	
	public void printLicensePlate() {
		for (String key: registry.keySet()) {
			System.out.println(key + " : " + registry.get(key));
		}
	}

	public void printOwners() {
		for (String key: registry.keySet()) {
			System.out.println(key);
		}
	}

}
