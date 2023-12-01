package problem8;
/**
 * This program demonstrates Try-Catch Block 
 */

public class Try_catch {
	
	static int array[] = {15,20,18,20};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {		
			
			//Try box is executed if the index of the array is within the boundary
			System.out.println(array[4]);
		}
		catch(Exception a) {
			
			
		//catch is used to catch the error and print the custom error message
			System.out.print("cannot access the element: Array index out of bounds");
		}
		

	}

}
