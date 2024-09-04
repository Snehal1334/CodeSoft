package task3;

public class Test {
	public static void main(String[] args) {
		BankAccount account=new BankAccount(1000);
		ATMInterface atm=new ATMInterface();
		atm.displayMenu();
	}

}
