package ClassExercises;
import java.util.Scanner; 
public class financeInterestRateCalculation {

	public static void main(String[] args) {
		// interest formula final = principle (1+ interest rate in decimal (not percentage)^number of years

		Scanner getInput = new Scanner (System.in); 
		
		double principleAmount, finalAmount; 
		double interestRate, finalYear; 
		
		
		System.out.println("Please Enter principle investment: " ); 
		principleAmount = getInput.nextDouble(); 
		
		System.out.println("Please Enter InterestRate: "); 
		interestRate = getInput.nextDouble(); 
		
		System.out.println("Please Enter Years of investment: "); 
		finalYear = getInput.nextDouble(); 
		
		
		for ( int years = 0; years <= finalYear; years++) {
			 
			finalAmount = principleAmount * Math.pow(1.0 + interestRate, years); 
			System.out.println("Years, Total Return: " + years + " , " + finalAmount);
		}
		

		
		getInput.close(); 
	}

}
