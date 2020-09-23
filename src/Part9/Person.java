package Part9;

import java.time.LocalDate;
import java.time.Month;

public class Person {

    protected String name;
    protected String address;
    protected String lastName;
    protected int birthYear;
    
    public Person(String name, String address) {
    	this.name = name; 
    	this.address = address;
    }
    
    
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    
    public Person(String firstName, String lastName, int birthYear){
    	this.name= firstName; 
    	this.lastName = lastName;
    	this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }
    
    public String getLastName() {
    	return this.lastName;
    }

    @Override
    public String toString() {
    	return name + "\n    " + address;
    }
}