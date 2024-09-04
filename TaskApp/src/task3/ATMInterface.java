package task3;

import java.util.Scanner;

public class ATMInterface {
	BankAccount bank= new BankAccount(1000);
	
	public void displayMenu()
	{
		Scanner sc =new Scanner(System.in);
		boolean flag=true;
		while(true)
		{
			System.out.println("-----ATM INTERFACE MENU-----");
			System.out.println("Enter your choice: ");
			System.out.println("1.Check Balance.\n 2.Deposit Money.\n 3.Withdraw Money.\n 4.Exit.");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1: {
				bank.checkBalance();
				break;
			}
			case 2: {
				bank.depositeMoney();
				break;
			}
			case 3: {
				bank.withdraw();
				break;
			}
			case 4: {
				System.out.println("Exit Successfully!!!");
				flag=false;
				break;
			}
			default:
				System.out.println("Invalid choice...Please try again.");
			}
		}
	}

}
