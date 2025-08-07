package day2;
import java.util.Scanner;

/*
ATM Menu Simulation

Question:
Create a Java program that simulates a simple ATM system using a do-while loop and switch case. The menu should include the following options:

1.     Check Balance

2.     Deposit

3.     Withdraw

4.     Exit

Choose: 1
Balance: 1000
Choose: 2
Enter deposit amount: 500
Choose: 1
Balance: 1500
Choose: 3
Enter withdrawal amount: 300
Choose: 1
Balance: 1200
Choose: 4
Thank you. Exiting.
 */


public class Question1 {
	public static void main(String[] args) {
		int bal=0,choice,temp;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("--- ATM MENU ---");
			System.out.println();
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.print("Choose: ");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println();
					System.out.println("Balance: "+bal);
					System.out.println();
					break;
				case 2:
					System.out.println();
					System.out.print("Enter deposit amount: ");
					temp=sc.nextInt();
					bal+=temp;
					System.out.println();
					break;
				case 3:
					System.out.println();
					System.out.print("Enter withdrawal amount: ");
					temp=sc.nextInt();
					if(temp>bal) {
						System.out.println();
						System.out.println("Balance is low.Try again :)");
					} else {
						bal-=temp;
					}
					System.out.println();
					break;
				case 4:
					System.out.println();
					System.out.println("Thank you. Exiting...");
					System.out.println();
					break;
			}
		} while(choice!=4);
	}
}
