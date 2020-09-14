package Part8;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
    
    public int hashCode() {
    	return day + month + year;
    }
    
    @Override
    public boolean equals(Object object) {
    	if (object.hashCode() == this.hashCode()) {
    		return true;
    	}else {
    		return false;
    	}
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}