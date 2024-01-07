package ClassExercises;

public class TryCatchArray {

	public static void main(String[] args) {
		{
			// student response matrix what number they picked with error 12  and 14 in matrix
					int responses[] = {1,2,3,4,5,2,1,3,3,1,4,12,1,2,5,2,3,4,4,14,};
				// array to count how many 1,2,3,4 and 5 were entered by adding 1 to element
					int[] frequency = new int[6];
				// go through response matrix and add 1 to frequency matrix
					for (int i=0;i<responses.length;i++) {
				// now check to be sure responses value is 1-5 if not gracefully go to error
						try {
							++frequency[responses[i]];
						}  // end of try
						catch(ArrayIndexOutOfBoundsException e) {
							System.out.println(e);
							System.out.println("responses[" + i + "]  =" + responses[i]);
						}   // end catch
					} // end loop through responses
					System.out.println("rating     frequency");  // set header for output table
					for (int rating=1;rating<frequency.length;rating++) {
						System.out.println(rating + "      " + frequency[rating]);
					}  // end for loop
//fault tolerant programming. This helps you find the problem. 
	       }

		}
	}
