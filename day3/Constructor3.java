/*
Bank Account Operations
Question:
Create a BankAccount class with private fields for account number, holder name, and balance.
Use a constructor to initialize data. Provide methods for deposit, withdraw, and check balance
with validation using if-else.
Expected Output:
Account: 123456 Deposited: 5000
Withdrawn: 2000 Balance: 3000
 */

package day3;
import java.util.Scanner;
class BankAccount {
	private int accno,bal;
//	private String holder;
	BankAccount(int accno) {
		this.accno=accno;
	}
	public void deposit(int amount) {
		bal+=amount;
	}
	public void withdraw(int amount) {
		bal-=amount;
	}
	public void chkbal() {
		System.out.println("Balance: "+bal);
	}
}
public class Constructor3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Account: ");
		int accno=sc.nextInt();
		BankAccount ac1=new BankAccount(accno);
		byte choice;
		int amount;
		do {
			System.out.print("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit\nEnter your choice: ");
			choice=sc.nextByte();
			if(choice==1) {
				System.out.print("Deposited: ");
				amount=sc.nextInt();
				ac1.deposit(amount);
			} else if(choice==2) {
				System.out.print("Withdrawn: ");
				amount=sc.nextInt();
				ac1.withdraw(amount);
			} else if(choice==3) {
				ac1.chkbal();
			} else if(choice==4) {
				System.out.println("Exiting...");
			} else {
				System.out.println("Enter a valid choice");
			}
		}while(choice!=4);
	}
}
