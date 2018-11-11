import java.util.*;
public class Hand {
	List<String> hand;
	
	void deal(Deck d)
	{
		this.hand = new ArrayList<String>();
		for(int i=0;i<2;i++)
		{
			this.hand.add(d.fullDeck.get(0));
			d.fullDeck.remove(0);
		}
	}
	
	void hit(Deck d) {
		this.hand.add(d.fullDeck.get(0));
	}
	
	int calculate_hand() {
		int sum = 0;
		for(int i=0;i<this.hand.size();i++) {
			String[] str = this.hand.get(i).split("\\s+");
			int rank = Integer.valueOf(str[1]);
			sum = sum + rank;
		}		
		return sum;
	}
	
	void display(int i) {
		for(int j =0;j<i;j++) {
			System.out.println(this.hand.get(j));
		}
	}
}
