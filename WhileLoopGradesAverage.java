package ClassExercises;
import java.util.Scanner ; 
public class WhileLoopGradesAverage {

	public static void main(String[] args) {
		
		Scanner getInput = new Scanner (System.in);

		
			//declare variables
			
			int counter = 0;
			int getGrades;
			int total= 0; 
			
			//getGrades input statement should be repeated for the next grade. 
			
			System.out.println("This is a grade averaging calculator. Please Enter Grades, then enter -1 when done:"); 
			getGrades = getInput.nextInt(); 
			 ; 
			
			while (getGrades != -1) {
				
				total = total + getGrades;
				counter ++ ;
				
				int highestGrade = getGrades;
				int lowestGrade = getGrades ; 
				
			if (getGrades > highestGrade) {
				highestGrade = getGrades; 
			}
			if (getGrades < lowestGrade) { 
				lowestGrade = getGrades ; 
			}
			
			 if (getGrades != -1) { 	
					int average; 
				average = total / counter ;
				System.out.println ("Your running average is:" + average );
				System.out.println ("Current Highest Grade:" + highestGrade + ", Current Lowest Grade:" + lowestGrade);
			
				//the next input statement should always be placed after the calculations are done, otherwise we are one step behind. 
				
				System.out.println ("Please enter the next grade"); 
				
				getGrades = getInput.nextInt(); 
				//else statement was not working out, as program would terminate right away without displaying termination statement. Fixed by nested if statement. 
				if (getGrades == -1) {
					System.out.println ("Program Terminated"); 
					
				}
			}
			
			
			}
		
		getInput.close(); 
		
	}

}
