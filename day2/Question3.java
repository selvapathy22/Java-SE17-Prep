package day2;
import java.util.Scanner;

/*
Simple Login Check

Question:
Write a Java program to simulate a login system that checks whether the entered username and password match predefined values using if-else and string comparison.

Sample Input:

Enter username: admin
Enter password: 1234

Expected Output:

Login successful!

Sample Input (Invalid):

Enter username: user
Enter password: pass

Expected Output:

Invalid credentials.
 */


public class Question3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username="admin";
		String password="1234";
		System.out.print("Enter username: ");
		String usernameip=sc.next();
		System.out.print("Enter password: ");
		String passwordip=sc.next();
		boolean userchk=username.equals(usernameip);
		boolean passchk=password.equals(passwordip);
		if(userchk&&passchk) {
			System.out.println("Login Successful!");
		} else {
			System.out.println("Invalid Credentials.");
		}
	}
}
