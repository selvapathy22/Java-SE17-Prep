package day2;
import java.util.Scanner;
/*
Even/Odd and Multiple of 5

Question:
Check if a number is even or odd and also if it is a multiple of 5 using nested if.

Sample Input:

Enter number: 10

Expected Output:

Even and a multiple of 5
 */

public class Question10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		if(a%5==0) {
			if(a%2==0) {
				System.out.println("Even and a multiple of 5");
			} else {
				System.out.println("Odd and a multiple of 5");
			}
		} else {
			if(a%2==0) {
				System.out.println("Even and not a multiple of 5");
			} else {
				System.out.println("Odd and not a multiple of 5");
			}
		}
	}
}
