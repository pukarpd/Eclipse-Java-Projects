package BlackJackProgram;
import java.util.*;
public class Deck {

	private Cards[] deckofCards; //array slots for the cards will be 52
	private int numberofCards; //this is the dynamically changing value 
	
	public Deck() {
		
		this(1, false);
		System.out.println("No Arguements/ Invalid");
	} // overloading arguements/parameters. 
	
	//constructor passing no argument of how many decks and whether or not to shuffle the cards. Collapse
	
	public Deck(int numberofDecks, boolean shuffled ) {
		
		
		
		this.numberofCards = numberofDecks * 52; //52 cards in each deck. 
		this.deckofCards = new Cards[this.numberofCards]; 
		
		int c = 0;
		
		for (int i = 0 ; i < numberofDecks; i++) {
			//card types 
			for (int j = 0; j<4; j++) { //this marks the loop for the 4 card types, hence the integer 4
				
				for (int k = 1; k<=13; k++ ) { //13 different cards Ace, 2 , 3, 4, 5, 6, 7 ,8, 9, 10, Jack, Queen, King. 
					
					this.deckofCards[c] = new Cards(CardTypes.values()[j], k); 
					c++; 
					
				}//end of nested loop 2
				
				
			} //end of nested for loop 1
			
		} //end of initial for loop 
		
		
		
		if (shuffled==true)
		{
			this.shuffled();
		}		
		
	} 
	
	
	public void shuffled(){
		Random myShuffler = new Random(); 
		Cards temp;
		int a; 
		for (int i = 0; i< this.numberofCards; i++) { //goes through the 52 cards
			
			//range of a is the number of cards, which will be generated randomly
			a = myShuffler.nextInt(this.numberofCards);
			
			//temp will hold the value of a temporarily while we perform the swap 
			temp = this.deckofCards[i]; 
			this.deckofCards[i] = this.deckofCards[a]; 
			this.deckofCards[a] = temp; 
			
		} //end of for loop 
	} //end of shuffled method 
	
	//dealer method
	public Cards dealmeaCard(){
		
		Cards top = this.deckofCards[0]; //deals the int value present at the first index, as per a real deck after shuffled. If its not Shuffled it will always be an Ace
		//the type of top is whatever type we have declared in Card. 
		
		//popping the already dealt card, we are using an array not an array list so need to pop. Array list is better. 
		
		for (int i = 1; i < this.numberofCards; i++ ){
			
			this.deckofCards[i-1] = this.deckofCards[i];  
			
		}
		this.deckofCards[this.numberofCards-1] = null; 
		
		this.numberofCards --; 
		
		return top; 
		
	} 
	
	//simply prints the deck. 
	
	public void printingtheDeck (int printNum) {
		
		for (int a = 0; a < printNum; a++) {
			
			System.out.printf("% 3d/%d %s\n", a+1, this.numberofCards, this.deckofCards[a].getcardName()); //pass the numerical value of the card to getCardName
		} 
		System.out.printf("\t[%d other]\n", this.numberofCards - printNum);

		
	} 
}
