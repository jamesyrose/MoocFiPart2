package Part9;

public class PackablesMain {

	public static void main(String[] args) {
	    PackableBox box = new PackableBox(10);

	    box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
	    box.add(new Book("Robert Martin", "Clean Code", 1));
	    box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

	    box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973, 1.1));
	    box.add(new CD("Wigwam", "Nuclear Nightclub", 1975, 1.2));
	    box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012, 1.2));
	  
	    System.out.println("Weight of Box is: " + box.weight());
	    System.out.println(box);
	}

}
