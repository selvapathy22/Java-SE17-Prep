/*
StringBuffer – Count Character Frequency
Question:
Count the frequency of each character.
Expected Output:
Input: aabbcc
a: 2, b: 2, c: 2
 */

package day4;
import java.util.Scanner;
public class Str14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer str=new StringBuffer(sc.next());
		while(str.length() > 0) {
			char ch = str.charAt(0);
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch) {
					count++;
				}
			}
			System.out.print(ch + ": " + count);
			str = new StringBuffer(str.toString().replace(ch + "", ""));
			if(str.length() > 0) System.out.print(", ");
		}
		sc.close();
	}
}
