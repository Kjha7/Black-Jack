import java.util.*;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Deck deck = new Deck();
		
		Hand player1 = new Hand();
		Hand computer = new Hand();
		deck.shuffle_deck();
		/*for(int i = 0;i<deck.fullDeck.size();i++)
				System.out.println(deck.fullDeck.get(i));*/
		player1.get_hand(deck);
		computer.get_hand(deck);
		int opt = 1;
		do {
			System.out.println("Press 1 for 'Hit' and 2 for 'Stand': ");
			opt = read.nextInt();
			if(opt == 1) {
				
			}
		}while(opt == 1);
	}

}
