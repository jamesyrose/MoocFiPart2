package Part10;

public class Card implements Comparable{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
    	// converting suit 
    	String val = "";
    	switch (this.value) {
    		case 1:
    			val = "A";
    			break;
    		case 11: 
    			val = "J";
    			break;
    		case 12: 
    			val = "Q";
    			break;
    		case 13:
    			val = "K";
    			break;
			default: 
				val = String.valueOf(this.value);
				break;
    	}
    	
        return suit + " " + val;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

	@Override
	public int compareTo(Object o) {
		if (((Card) o).getValue() < this.value) {
			return 1;
		}else if (((Card) o).getValue() > this.value) {
			return -1;
		}else {
			return 0;
		}
	}
}