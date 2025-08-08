/*
StringBuffer – Palindrome Check
Question:
Check if a string is a palindrome using reverse().
Expected Output:
Input: madam
Result: Palindrome
 */

package day4;
import java.util.Scanner;
public class Str9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str=new StringBuilder(sc.next());
		sc.close();
		if(str.equals(str.reverse())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
