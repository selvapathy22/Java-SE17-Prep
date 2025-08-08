/*
String – Password Strength Validator
Question:
Validate password strength: must contain uppercase, lowercase, digit, special character.
Expected Output:
Input: Test@123
Result: Strong Password
 */

package day4;
import java.util.Scanner;
public class Str4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str= sc.next();
		sc.close();
		boolean uc=false,lc=false,dig=false,sp=false;
		for(int i=0;i<str.length();i++) {
			int temp=str.charAt(i);
			if(temp>='A' && temp<='Z') {
				uc=true;
			} else if(temp>='a'&&temp<='z') {
				lc=true;
			} else if(temp>='0'&&temp<='9') {
				dig=true;
			} else {
				sp=true;
			}
		}
		if(uc&&lc&&dig&&sp) {
			System.out.println("Result: Strong Password");
		} else {
			System.out.println("Result: Weak Password");
		}
	}
}
