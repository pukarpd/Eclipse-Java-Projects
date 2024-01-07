/**
 * 
 */
package ClassExercises;
import java.util.Scanner ; 

/**
 * 
 */
public class testingSwitch {

	public static void main(String[] args) {
		// switch statement, days of weeks. 
		System.out.printf("%s %s", "Hello" , "World");

System.out.println("\"Java is fun\"");


 

		Scanner getInput = new Scanner (System.in); 
		
		int dayofWeek ; 
		
		System.out.println("Enter an integer 0-6:");
		dayofWeek = getInput.nextInt(); 
		
		switch (dayofWeek) {
		case 0: 
		case 6: 
			System.out.println("Weekend");
			break;
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			System.out.println("Weekday");
			break; 
				default: System.out.println("you didnt do as ordered."); 
		
		
				
				getInput.close() ; 
		} //end of switch statement
	}

}
