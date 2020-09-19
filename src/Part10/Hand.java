package Part10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
	private List<Card> hand;
	
	public Hand() {
		hand = new ArrayList<>();
	}
	
	public void add(Card card) {
		hand.add(card);
	}
	
	public void print() {
		for (Card card: this.hand) {
			System.out.println(card);
		}
	}
	
	public void sort() {
		this.hand.sort((p1, p2) -> p1.compareTo(p2));
	}

	public int cardValueSum() {
		int sum = 0;
		for (Card card: this.hand) {
			sum += card.getValue();
		}
		return sum;
	}
	
	public void sortBySuit() {
		Collections.sort(this.hand, (c1, c2) -> c2.getSuit().ordinal() - c1.getSuit().ordinal());

	}

	@Override
	public int compareTo(Hand o) {
		if (o.cardValueSum() > this.cardValueSum()) {
			return -1;
		}else if (o.cardValueSum() < this.cardValueSum()) {
			return 1;
		}else { 
			return 0;
		}
	}
}
