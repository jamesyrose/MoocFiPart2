package Part11;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private int seat; 
	private int code; 
	private List<Show> shows; 
	
	public Ticket(int seat, int code) {
		this.shows = new ArrayList<>();
	}
	
	public void addShow(Show show) {
		this.shows.add(show);
	}
	
}
