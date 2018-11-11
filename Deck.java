import java.util.*;

public class Deck {
	private static final String[] suits = {
	        "Heart", "Diamond", "Club", "Spade"
	    };
	private static final String[] ranks = {
	        "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
	    };
	
	List<String> fullDeck;
	
	Deck() {
		
	 this.fullDeck = new ArrayList<String>();
	
		for(int suit = 0; suit < 4; suit++) {
			for(int rank = 0; rank < 13; rank++) {
				fullDeck.add(suits[suit]+ " " + ranks[rank]);
			}
		}
	}
	
	void shuffle_deck() {
			Collections.shuffle(this.fullDeck);
		}
}
