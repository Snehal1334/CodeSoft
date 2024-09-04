package task3;

import java.util.Scanner;

public class BankAccount {
	Scanner sc=new Scanner(System.in);
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance =initialBalance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void depositeMoney()
	{
		System.out.println("Enter the amount you want to deposite: ");
		double amt=sc.nextDouble();
		if(amt > 0)
		{
			balance=balance+amt;
			System.out.println("Deposite successful...New balance: "+balance);
		}
		else {
			System.out.println("Invalid deposite amount.\n Plz try again..");
		}
	}
	
	public void withdraw()
	{
		System.out.println("Enter the amount you want to withdraw: ");
		double amt=sc.nextDouble();
		if(amt >0 && amt <=balance)
		{
			balance= balance-amt;
			System.out.println("Withdrawal successful...New balance: "+balance);
		}
		else {
			System.out.println("Invalid or insufficient funds for withdrawal..\n Plz try again.");
		}
		
	}
	public void checkBalance()
	{
		System.out.println("Your current balance is: "+balance);
	}
	
	
	
	

}
