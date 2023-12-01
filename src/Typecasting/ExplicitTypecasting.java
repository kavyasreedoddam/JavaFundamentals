package Typecasting;
/**
 * this demonstration is about Explicit type casting
 * implicit type casting will be done by type casting manually
 */

public class ExplicitTypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d_price=5234.87d;
		long l_price = (long) d_price;//type casting is done from double---->long explicitly
		int i_price = (int) l_price;//type casting is done from double---->long-----> int explicitly
		short s_price = (short) i_price;//type casting is done from double---->long-----> int-->short explicitly
		byte b_price = (byte) d_price;//type casting is done from double---->byte explicitly
		
		System.out.println("Double Price ="+ d_price);
		System.out.println("Long Price ="+ l_price);
		System.out.println("Int Price ="+ i_price);
		System.out.println("Short Price ="+ s_price);
		System.out.println("Byte Price ="+ b_price);
	
		

	}

}
