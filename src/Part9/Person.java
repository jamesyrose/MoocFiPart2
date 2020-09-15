package Part9;

import java.time.LocalDate;
import java.time.Month;

public class Person {

    protected String name;
    protected String address;
    
    public Person(String name, String address) {
    	this.name = name; 
    	this.address = address;
    }

    @Override
    public String toString() {
    	return name + "\n    " + address;
    }
}