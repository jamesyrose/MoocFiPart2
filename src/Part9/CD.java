package Part9;

public class CD implements Packables{

	private String name;
	private String author;
	private int pubYear; 
	private double weight;

	public CD(String name, String author, int publicationYear) {
		this(name, author, publicationYear, 0.0);
	}
	
	public CD(String name, String author, int publicationYear, double weight) {
		this.name = name; 
		this.author = author; 
		this.pubYear = publicationYear; 
		this.weight = weight;
	}

	@Override
	public double weight() {
		return weight;
	}

	@Override
	public String toString() {
		return name + author + pubYear + weight;
	}
}
