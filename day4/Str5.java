/*
String – URL Validator
Question:
Check if a string is a valid URL (starts with http/https, contains domain).
Expected Output:
Input: https://example.com
Result: Valid URL
 */

package day4;
import java.util.Scanner;
public class Str5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str=sc.next();
		String chkstr1="http";
		String chkstr2="https";
		sc.close();
		if(str.substring(0, 4).equals(chkstr1) || str.substring(0, 5).equals(chkstr2)) {
			System.out.println("Valid URL");
		} else {
			System.out.println("Invalid URL");
		}
	}
}
