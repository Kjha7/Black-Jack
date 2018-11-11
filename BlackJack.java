import java.util.*;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Deck deck = new Deck();/*
		for(int i = 0;i<deck.fullDeck.size();i++)
			System.out.println(deck.fullDeck.get(i));*/
		
		Hand player1 = new Hand();
		Hand computer = new Hand();
		deck.shuffle_deck();
		System.out.println("\t\tPlayer");
		player1.deal(deck);
		player1.display(2);
		System.out.println("\t\tComputer");
		computer.deal(deck);
		computer.display(1);
		System.out.println("***");
		int choice = 1;
		int count = 3;
		int card_sum_player = player1.calculate_hand();
		System.out.println("\t\tPlayer");
		do {
			if(card_sum_player < 21) {
				System.out.println("Press 1 for 'Hit' and 2 for 'Stand': ");
				choice = read.nextInt();
				if(choice == 1) {
					player1.hit(deck);
					player1.display(count++);
					card_sum_player = player1.calculate_hand();
					System.out.println("Total Sum: "+ card_sum_player);
				}
			}
			else if(card_sum_player == 21) {
				System.out.println("You have won the game");
				return;
			}
			else {
				System.out.println("You lost the game");
				return;
			}
		}while(choice == 1);
		
		int count_c = 3;
		System.out.println("\t\tComputer");
		computer.display(2);
		int card_sum_comp = computer.calculate_hand();
		if(card_sum_comp > card_sum_player)
		{
			System.out.println("Computer won. You lost...");
			return;
		}
		while(card_sum_comp < card_sum_player) {
			computer.hit(deck);
			computer.display(count_c++);
			card_sum_comp = computer.calculate_hand();
			System.out.println("Total Sum: "+ card_sum_comp);
			if(card_sum_comp > 21) {
				System.out.println("Computer lost. You are the winner....");
				return;
			}
		}
	}
}
