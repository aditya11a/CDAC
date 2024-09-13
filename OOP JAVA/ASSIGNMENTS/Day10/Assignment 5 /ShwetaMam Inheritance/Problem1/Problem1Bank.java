package questionfirst;

import java.util.Scanner;

//1)	Create a base class BankAccount with methods like deposit() and withdraw(). 
//Derive a class SavingsAccount that overrides the withdraw() method to impose a limit 
//on the withdrawal amount. Write a program that demonstrates the use of overridden 
//methods and proper access modifiers & return the details.
class BankAccount{
	int accountNumber;
	int Balance;
	int amount;
	Scanner c=new Scanner(System.in);
	public BankAccount() {
		System.out.println("Enter Bank Account Number");
		accountNumber=c.nextInt();
		System.out.println("Enter Account Balance");
		Balance=c.nextInt();
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	int deposit(){
		System.out.println("Enter The Amount to be Deposited");
		amount=c.nextInt();
		Balance=Balance+amount;
		System.out.println("Total Balance : "+Balance);
		return Balance;
	}
	int withdraw(){
		System.out.println("Enter The Amount to be withdrawn");
		amount=c.nextInt();
		Balance=Balance-amount;
		System.out.println("Total Balance : "+Balance);
		if(amount>Balance&&amount>0) {
			Balance=Balance-amount;
		}
		return Balance;
	}
	void resourceClose(){
		c.close();
	}
	
}
class SavingsAccount extends BankAccount{
	static int limitt=10000;
	public static int getLimit() {
		return limitt;
	}
	public static void setLimit(int limit) {
		SavingsAccount.limitt = limit;
	}
	public int withdraw(){
		if(limitt<=amount) {
			System.out.println("You cant withdraw more than 10000 in one time");
			
		}
		else {
			 super.withdraw();
			 
			
		}
		return Balance;
		
	}
	
}
public class Problem1Bank {
	public static void main(String args[]) {
		SavingsAccount b=new SavingsAccount();
		b.deposit();
		b.withdraw();
		b.resourceClose();
		
		
	}

}
