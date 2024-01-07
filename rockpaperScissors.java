package ClassExercises;
import java.util.Scanner; 
public class rockpaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int botGuess, playerGuess ; 

	Scanner typeIn = new Scanner (System.in);
	botGuess = (int) (Math.random ()*3) ;
	//this is a rock paper scissors game developed using nested switch statements. 
	//always have the print statement before getting user input!!// 

	System.out.printf ("Lets play rock paper scissors%n"
			+ "Enter 0 for Rock %n"
			+ "Enter 1 for Paper %n"
			+ "Enter 2 for Scissors:%n");
	
	playerGuess = typeIn.nextInt(); 
		//nested switch statements: 
	switch (botGuess) {
	case 0: 
		switch (playerGuess) {
		case 0: System.out.println("it's a tie");
		break; 
		case 1: System.out.println("Congratulations, You WIN!!!! Your paper wrapped my rock");
		break; 
		case 2: System.out.println("Oops! You LOSE! My rock smehsed your scissors");
		break; 
		default: System.out.println("Please type a valid response (0-2)");
		break; 
		}
		break;
	case 1: 
		switch (playerGuess) {
		case 0: System.out.println("You lose, wrapped your rock with paper");
		break; 
		case 1: System.out.println("Its a paper clash!");
		break; 
		case 2: System.out.println("MAN! Im Shredded to bits, put them scissors away!");
		break; 
		default: System.out.println("Please type a valid response (0-2)");
		break; 
		}
		break; 
	case 2: 
		switch (playerGuess) {
		case 0: System.out.println("You have smashed my scissors to pieces, you WIN!");
		break; 
		case 1: System.out.println("HAHA, RIPPED YOU TO SHREDS! nice try");
		break; 
		case 2: System.out.println("We are Scissoring!");
		break; 
		default: System.out.println("Please type a valid response (0-2)");
		break; 
		}
		break; 
	default: System.out.println("THE BOT IS BROKEN"); 
	
	typeIn.close() ;
			
	}
}

							}
