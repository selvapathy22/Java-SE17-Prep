package day2;
import java.util.Scanner;

/*
 Check Eligibility to Vote using Selection Statements

Question:
Write a Java program to check if a person is eligible to vote (age >= 18).

Sample Input:

Enter age: 19

Expected Output:

Eligible to vote
 */


public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age: ");
		byte age=sc.nextByte();
		if(age>=18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to vote :(");
		}
	}
}
