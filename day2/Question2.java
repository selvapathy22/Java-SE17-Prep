package day2;
import java.util.Scanner;

/*
Prime Number Check

Question:
Write a Java program that accepts a number and checks whether it is a prime number using a conditional statement.

Sample Input:

Enter number: 17

Expected Output:

Prime
 */

public class Question2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=scanner.nextInt();
		boolean res=false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				res=true;
			}
		}
		if(res) {
			System.out.println("Not a prime");
		} else {
			System.out.println("Prime");
		}
	}
}
