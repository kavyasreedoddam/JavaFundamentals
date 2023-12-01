package accessmodifier;

public class PublicModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object
		Park park = new Park();
		
		System.out.println(park.title);
		System.out.println();
		
		park.showDetails();
		park.showStatues();
		
		

	}

}

class Park {
	
	//public data members
	public String title = "Rajeev Gandhi International Park";
	public int chairCount = 100;
	public short statuesCount = 30;
	public byte games = 10;
	
	//public methods
	public void showDetails() {
		System.out.println(this.title + " has chair count : "+ this.chairCount +" and statues are : "+this.statuesCount);
	}
	public void showStatues() {
		System.out.println(this.title + " has total "+this.statuesCount +" statues.");
	}
	
	//create a constructor
	public Park() { };
	
}
