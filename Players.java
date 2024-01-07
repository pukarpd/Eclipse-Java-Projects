package BlackJackProgram;

public class Players {
	
	// Cards in hand 
	private String playerName; 
	private Cards[] handofCards = new Cards[10]; 
	private int numberofCards; 
	private int maxnumCards = 8; 
	public Players() {
		System.out.println("No Arguements");
		
	} 
	
	public Players(String name) {
		this.playerName = name; 
		this.emptyingtheHand(); 
		
	} 
	
	//reset button
	
	public void emptyingtheHand() {
		
		for (int a = 0; a < 10; a++ ) {
			this.handofCards[a] = null; 
			
		}
		this.numberofCards = 0; 
	}
	
	//this method will add a card when the player says hit or stay. Dealer's calculations are based upon optimal blackjack strategy
	
	public boolean addaCard(Cards acardType) {
		
		if (this.numberofCards == this.maxnumCards) {
			System.out.println("Hey "+ this.playerName + " you have already have 10 cards, you have reached your limit");
		}
		this.handofCards[this.numberofCards] = acardType; 
		this.numberofCards ++; 
		
		return (this.gethandSum() <= 21);
	}  
	
	public int gethandSum(){
		int handSum = 0; 
		int cardNumber; 
		int numberofAces = 0; 
		
		
		//calculate the contribution to sum 
		
		for (int c =0; c < this.numberofCards; c++ ) {
			//current card 
			
			cardNumber = this.handofCards[c].getnumberValue(); 
				if (cardNumber ==1) {
					numberofAces++; 
					handSum += 11; 
				} 
				else if (cardNumber > 10) {
					handSum += 10; 
			
				}
				else {
					handSum += cardNumber; 
				}
		} 
		
		// while loop will fix the 21 problem. 
		
		while (handSum > 21 && numberofAces > 0) {
			handSum -= 10; 
			numberofAces--; 
		} 
		return handSum; 
			
	} 
	
	//simple method to print the hand of any player involved. Including dealer which is implemented in the main program. 
	public void printmyhand (boolean showfirstCard) {
		System.out.println(this.playerName + "'s Cards:"); 
		for (int c = 0; c < this.numberofCards; c++) {
			if (c==0 && !showfirstCard) {
				System.out.println("    [Hidden]"); 
			} else {
				System.out.println(this.handofCards[c].getcardName()); 
			}
			
			
		} 
	} 
	
}
