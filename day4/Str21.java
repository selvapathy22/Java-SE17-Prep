/*
 StringBuffer – Remove Whitespaces
Question:
Remove all whitespace from the string.
Expected Output:
Input: Hello World Java
Output: HelloWorldJava
 */

package day4;
import java.util.Scanner;
public class Str21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str=new StringBuilder(sc.nextLine());
		sc.close();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				str.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("Output: "+str);
	}
}
