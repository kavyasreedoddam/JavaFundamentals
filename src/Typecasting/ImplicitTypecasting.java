package Typecasting;
/**
 * this demonstration is about implicit type casting
 * implicit type casting will be done automatically
 */

public class ImplicitTypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte small_count = 100; //assigning a value
		short s_count = small_count;//type casting will automatically done byte---->short
		int i_count = s_count;//type casting will automatically done byte---->short---->int
		long l_count = i_count;//type casting will automatically done byte---->short---->int---->long
		float f_count = l_count;//type casting will automatically done long---->float
		double d_count = small_count;//type casting will automatically done byte---->double
		
		System.out.println("Byte count=" +small_count);
		System.out.println("Sort count=" +s_count);
		System.out.println("Int count=" +i_count);
		System.out.println("Long count=" +l_count);
		System.out.println("Float count=" +f_count);
		System.out.println("Double count=" +d_count);
		

	}

}
