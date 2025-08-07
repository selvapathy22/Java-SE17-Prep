package day2;
import java.util.Scanner;

/*
Nested Conditions for Pass/Fail with Grace Marks
Question:
Write a Java program that checks if a student passes with grace marks. If marks are between 30–34, show “Pass with Grace”, otherwise use normal pass/fail conditions.

Sample Input:

Enter marks: 32

Expected Output:

Pass with Grace

 */


public class Question6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks: ");
		byte mark=sc.nextByte();
		if(mark>=30 && mark<=34) {
			System.out.println("Pass with grace");
		} else if (mark<30) {
			System.out.print("Fail");
		} else {
			System.out.print("Pass");
		}
	}
}
