package problem6;
/**
 * This program demonstrates of classes,objects and interface
 */

public class ClassObjectIn {
	ClassObjectIn(){} // constructor is created
	int x = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object instance
		ClassObjectIn a= new ClassObjectIn();
		Show s =new Show();
		System.out.println(a.x); //accessing objects from same class
 		s.display();   // accessing objects from different class

	}

}
class Show{
	int r = 19;
	public void display() {
		System.out.println(this.r);
	}
}