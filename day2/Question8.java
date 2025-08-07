package day2;
import java.util.Scanner;

/*
Character Type Checker

Question:
Write a program that accepts a character and classifies it as alphabet, digit, or special symbol using if-else.

Sample Input:

Enter character: $

Expected Output:

Special Symbol
 */

public class Question8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter character: ");
		char a=sc.next().charAt(0);
		if(a>='a' && a<='z' || a>='A' && a<='Z') {
			System.out.println("Alphabet");
		} else if (a>='0' && a<='9') {
			System.out.println("Numeric");
		} else {
			System.out.println("Special Symbol");
		}
	}
}
