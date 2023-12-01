package problem9;

import java.util.Scanner;

/**
 * This program demonstrates Throw and Throws group
 */
public class Throwables {
	//throws keyword is used  to show that the method may throw an exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 100: ");
		
		int i =s.nextInt();
		
		if(i>=50) {
			/*throw keyword is used to throw an exception
			 * 
			 */
			throw new ArrayIndexOutOfBoundsException("Element is greater than 50");
		}
	}

}


