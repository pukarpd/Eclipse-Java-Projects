package ClassExercises;

import java.util.*;

public class StudetAveragingRandom {

	public static void main(String[] args) {
		
//Random getNumber = new Random(); 
Scanner getInput = new Scanner(System.in); 	
		
System.out.println("Please enter the number of students" ); 
int numStudents = getInput.nextInt(); 


int[] student = new int[numStudents]; 

for (int i = 0; i<student.length; i++) {
	
	
	// student [i] is actually the grade being assigned between 0 and a 100. Depends on next int or next double. 
	System.out.println ("Enter student grade."); 
	student[i] = getInput.nextInt(); 
	System.out.println ("grade for the student " + i + " = " + student[i]); 

};
	
//average of all grades: 
double averageGrade = 0;
for( int i = 0; i<student.length; i++) {
	
	averageGrade += student[i]; 
}

averageGrade = averageGrade/student.length; 

System.out.println ("Average is:" + averageGrade + " Student total:" + student.length); 

		getInput.close();
		
		
		
	}

}
