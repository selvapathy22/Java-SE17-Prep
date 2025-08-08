/*
 StringBuilder – Capitalize Each Word
Question:
Capitalize the first letter of each word in a sentence.
Expected Output:
Input: java is fun
Output: Java Is Fun
 */

package day4;
import java.util.Scanner;
public class Str20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer s=new StringBuffer(sc.nextLine());
		sc.close();
		s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				s.setCharAt(i+1, Character.toUpperCase(s.charAt(i+1)));
			}
		}
		System.out.println("Output: "+s);
	}
}
