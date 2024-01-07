package BlackJackProgram;

public class Cards {

	// Card types for a single card 
	
	public CardTypes cardType; 
	
	// Card's Value
	private int numberValue; 
	
	public Cards () {
		
		System.out.println("This is a default constructor"); 
	}
	
	
	//variable constructor for card types, allows instance creation of the class card. 
	public Cards( CardTypes acardType, int anumberValue) {
		
		this.cardType = acardType; 
		
		if (anumberValue >= 1 && anumberValue <= 13 ) {
		this.numberValue = anumberValue; 
													} // end of if bracket 
		else { System.err.println( anumberValue + "this is not a valid card");
		
		}// end of else bracket 
	}// end of public Cards constructor
	
	//number value returned
	
	public int getnumberValue () {
		
		return numberValue; 
		
	}
	/*tried using arrays here but the switch statement with the enums made it a lot easier than writing two arrays.
	 * I was missing something for the arrays
	 * 
	 **/
	public String getcardName() {
		
		String valueString = "err"; 
		
		switch (this.numberValue) {

		case 1: 
			valueString = "Ace "; 
			break; 
		case 2: 
			valueString = "Two "; 
			break; 
		case 3: 
			valueString = "Three "; 
			break; 
		case 4: 
			valueString = "Four "; 
			break; 
		case 5: 
			valueString = "Five "; 
			break; 
		case 6: 
			valueString = "Six "; 
			break; 
		case 7: 
			valueString = "Seven "; 
			break; 
		case 8: 
			valueString = "Eight "; 
			break; 
		case 9: 
			valueString = "Nine "; 
			break; 
		case 10: 
			valueString = "Ten "; 
			break; 
		case 11 : 
			valueString = "Jack "; 
			break; 
		case 12: 
			valueString = "King "; 
			break; 
		case 13: 
			valueString = "Queen "; 
			break; 
		
			
		}
		
			return valueString + "of " + cardType;
		
	
		
		
		//tried doing it as an array but couldn't figure out how to do it in a case by case basis, need to use switch. 
		/*String[] valueString = {("Two"), ("Three"), ("Four"), ("Five"), ("Six"), ("Seven"), ("Eight"), ("Nine"), ("Ten"), ("Jack"), ("Queen"), ("King"), ("Ace")};
		int [] valueNumber = {2,3,4,5,6,7,8,9,10,11,12,13,14};  
		
		for ( int i = 0; i <valueNumber.length; i++ ) {
			
			for (int j = 0; j<valueString.length; j++) {
				//got stuck here. 
				return valueString[j] + "of" + cardType.getcardName();
			}
		
		}*/

		
		
		
	}
}
