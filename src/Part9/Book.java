package Part9;

public class Book implements Packables {
	private String name;
	private String author;
	private double weight;
	
	public Book(String name) {
		this(name, "", 0.0);
	}
	
	public Book(String name, String author) {
		this(name, author, 0.0);
	}
	
	public Book(String name, String author, double weight) {
		this.name = name; 
		this.author = author;
		this.weight = weight;
	}

	@Override
	public double weight() {
		return weight; 
	}

	@Override
	public String toString() {
		return name + " " + author + " weight: " + weight;
	}
	
}
