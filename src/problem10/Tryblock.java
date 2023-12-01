package problem10;

import java.io.FileOutputStream;

public class Tryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Try block to check for exceptions
        try (
 
            // Creating an object of FileOutputStream
            // to write stream or raw data
 
            // Adding resource
            FileOutputStream fos
            = new FileOutputStream("textfile.txt")) {
 
            // Custom string input
            String text
                = "Hello World. This is my java program";
 
            // Converting string to bytes
            byte arr[] = text.getBytes();
 
            // Text written in the file
            fos.write(arr);
        }
 
        // Catch block to handle exceptions
        catch (Exception e) {
 
            // Display message for the occurred exception
            System.out.println(e);
        }
     // Display message for successful execution of
        // program
        System.out.println("Resource are closed and message has been written into the textfile.txt");
    

	}

}
