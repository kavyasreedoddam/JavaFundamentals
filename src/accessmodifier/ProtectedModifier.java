package accessmodifier;

public class ProtectedModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object
				House house = new House();
				
				System.out.println("Name:" + house.name);
				System.out.println();
				System.out.println("No of Room's :" + house.noofRooms);
				System.out.println("No of Kitechens's :" + house.noofKitchen);
				System.out.println();
				house.showDetails();

	}

}


class House {
	protected String name = "KAVYA Villa" ;
	protected byte noofRooms = 50 ;
	protected byte noofKitchen = 5 ;
	protected byte noofBalcony= 20;
	
	protected String showName() {
		return this.name;
		
	}
	
	protected void showDetails() {
		System.out.println(this.name + " has total "+ this.noofRooms + "rooms,"+ this.noofKitchen+
				"kitchen and "  + this.noofBalcony + "balconines");
		
	}
	protected House () {}
	
}