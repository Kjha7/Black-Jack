import java.util.*;
public class Hand {
	List<String> hand;
	
	void get_hand(Deck d)
	{
		this.hand = new ArrayList<String>(2);
		for(int i=0;i<hand.size();i++)
		{
			this.hand.add(d.fullDeck.get(0));
			d.fullDeck.remove(0);
		}
	}
	
	void hit(Deck d) {
		this.hand.add(d.fullDeck.get(0));
	}
	
	void calculate_hand() {
		
	}
}
