package BlackJackProgram;
import java.util.*; 
public class BlackJackGame {

	public static void main(String[] args) {
	
		Scanner getInput = new Scanner(System.in); 
		
		Deck myDeck = new Deck(1, true); 
		
		
		/*
		 *
		 * // Tried to implement this code but couldnt get it to work with methods, as the players created in the
		 *  array'd index would not work when applied to methods.
		 *  additionally getting the index'd array to work with the loops proved to be very tricky. So i just went with the old school
		 *  independent variables with scanner inputs. This version of my blackjack program is very simple. 
		System.out.println("How many players? (1-4): ");
	    int numPlayers = getInput.nextInt();

	    String[] playerNames = new String[numPlayers];
	    for (int i = 0; i < numPlayers; i++) {
	      System.out.print("Enter name for player " + (i + 1) + ": ");
	      String name = getInput.next();
	      playerNames[i] = name;
	    }

	    // Create players
	    Players[] players = new Players[numPlayers];
	    for (int i = 0; i < numPlayers; i++) {
	      players[i] = new Players(playerNames[i]);
	    }*/
		
		//Player 1 name and betting amount 
		System.out.println("Enter the name of player 1"); 
		String numberOne = getInput.next(); 
		
		System.out.println("Enter the betting amount");
		double player1Money = getInput.nextDouble();

		
		//player two name and betting amount 
		System.out.println("Enter the name of player 2"); 
		String numberTwo = getInput.next(); 
		
		System.out.println("Enter the betting amount");
		double player2Money = getInput.nextDouble();
		
		Players player1 = new Players(numberOne); 
		Players player2 = new Players(numberTwo); 
		Players dealer = new Players ("Dealer"); 
		
		
		//first card dealt
		player1.addaCard(myDeck.dealmeaCard()); 
		player2.addaCard(myDeck.dealmeaCard()); 
		dealer.addaCard(myDeck.dealmeaCard()); 
		//second card dealt
		player1.addaCard(myDeck.dealmeaCard()); 
		player2.addaCard(myDeck.dealmeaCard()); 
		dealer.addaCard(myDeck.dealmeaCard());
		
System.out.println("The Cards are at Play \n");

		player1.printmyhand(true);
		System.out.println("\n\n\n");

		player2.printmyhand(true);
		System.out.println("\n\n\n");

		dealer.printmyhand(false);
		System.out.println("\n");
		
		
		boolean p1Done = false;
		boolean p2Done = false;
		boolean dealerDone = false;
		
		/*tried separating the while loop but had to create numerous nested loops and kept getting errors, this is the best I achieved. 
		 * Either both players can hit or stay.
		 * Almost like a team blackjack game. I know that was not the requirements but the methods were not working independently for each player. 
		 * Everything else works.
		*/
		
		while (!p1Done || !p2Done || dealerDone ) {
			
				if (!p1Done || !p2Done ) {
				
				System.out.println("Would you like to hit or stay?");
				String horS = getInput.next(); 
				System.out.println("\n\n\n");
				
					if (horS.compareToIgnoreCase("Hit") == 0) {
					
					p1Done = !player1.addaCard(myDeck.dealmeaCard());
					p2Done = !player2.addaCard(myDeck.dealmeaCard());
					player1.printmyhand(true);
					player2.printmyhand(true);

					
						} else {
						p1Done = true; 
						p2Done = true; 
					} 
			}
			
}
				//dealer's play/ dealers hand
				
				if (!dealerDone) {
					if (dealer.gethandSum()<17) {
						
						System.out.println("The Dealer Hits \n \n");
						dealerDone = !dealer.addaCard(myDeck.dealmeaCard()); 
						dealer.printmyhand(false);
					} else {
						System.out.println("The Dealer Stays \n \n");
						dealerDone = true; 
						
					}
					System.out.println("\n\n\n");

					
				} 
				
				
				//all the players get passed to the print my hand method
				player1.printmyhand(true);
				System.out.println("\n\n\n");

				
				player2.printmyhand(true);
				System.out.println("\n\n\n");

				
				dealer.printmyhand(true);
				System.out.println("\n\n\n");

				/*passing Players's cards to the summing calculator, which will add the values of the cards. We are assigning them to a variable 
				 * 
				 * 
				 * */ 
				int p1Sum = player1.gethandSum();
				int p2Sum = player1.gethandSum();
				int dealerSum = player1.gethandSum();
				
				
				// the final decision making and seeing who won, who lost and who wins how much money. If dealer wins, they get all the money. 
				if (p1Sum > dealerSum && p1Sum <= 21 || dealerSum ==21) {
					System.out.println(numberOne + " Wins");
					player1Money = player1Money * 1.5; 
					System.out.println(numberOne + " Leaves with" + player1Money);
					
				} else if (p2Sum > dealerSum && p2Sum <= 21 || dealerSum ==21) { 
					System.out.println(numberTwo + " Wins");
					player2Money = player2Money * 1.5; 
					System.out.println(numberTwo + " Leaves with" + player2Money); 
					
				} else {
					System.out.println("Dealer Wins, All players lost their money");

				}
				
				getInput.close();

				
				
				

		}
	}


