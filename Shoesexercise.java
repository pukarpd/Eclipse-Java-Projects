/*
 * A program that gives a bunch of details about shoes*/
package ClassExercises;
import java.util.Scanner; 
public class Shoesexercise {

	public static void main(String[] args) {
//variables
		int numberPairsShoes; 
		double costPairShoes, taxRate, cashPaid; //assume always have enough money to pay for shoes 
		
		Scanner getInput = new Scanner (System.in);
		
		//User inputs and Print statements
		
		System.out.println("enter number of pair of shoes:"); 
		numberPairsShoes = getInput.nextInt(); 
		
		System.out.println("enter the cost for shoes:"); 
		costPairShoes = getInput.nextDouble();
		
		System.out.println("enter your payment amount:"); 
		cashPaid = getInput.nextDouble();
		
		System.out.println("enter the tax:");
		taxRate = getInput.nextDouble();
		
		getInput.close();
		//formulations: 
		
		double costforshoes = numberPairsShoes * costPairShoes;
		double taxonshoes = costforshoes * taxRate ; 
		double totalCostShoes = taxonshoes + costforshoes ; 
		double change = cashPaid - totalCostShoes ; 
		
		// couldve done all the variables and combined into one formula, but the three statements is better due to legibility. 
		// not writing code for self, writing for someone else. 
		

		System.out.println("Total Cost: " + totalCostShoes + "Change Returned: " + change);

		
	}

}
