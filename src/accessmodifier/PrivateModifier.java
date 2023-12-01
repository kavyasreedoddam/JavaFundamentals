package accessmodifier;

public class PrivateModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object
		BankAccount account = new BankAccount();
		
		//public methods
		account.showName();
		account.showBalance();
		//account.showEmail(); it cannot visible bcz showemail has private method

	}

}

class BankAccount {
	//data members

	private long accNo = 349583348;
	private double accBalance = 45454.454d;
	private String fullName = "kavyasreedoddam";
	private String email = "kavyasreedoddam@gmail.com";

	// methods
	private String showEmail() {
		return this.email;
	}

	public void showBalance() {
		System.out.println("The Account : " + this.accNo + " has balance : $"+this.accBalance);
	}

	public void showName() {
		System.out.println("The Account : " + this.accNo + " blongs to : "+this.fullName);
	}

	public BankAccount() { } // Private Constructor based class can not be instantiated.
}