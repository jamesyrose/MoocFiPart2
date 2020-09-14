package Part8;

import java.util.Arrays;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    
    public static int convertToInt(String str) {
    	String code = "";
    	for (int i = 0; i < str.length(); i++) {
    		char c = str.charAt(i);
    		code += (int) c;
    	}
    	return (int) Long.parseLong(code);
    	
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj.hashCode() == this.hashCode()) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    @Override 
    public  int hashCode() {
    	int liCode = convertToInt(liNumber);
    	int countryCode = convertToInt(country);
    	String code = "" + countryCode + liCode;
    	return (int) Long.parseLong(code);
    }
    	
    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}