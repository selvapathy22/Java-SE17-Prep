/*
String – Substring Occurrence Count
Question:
Count how many times a substring occurs in a string.
Expected Output:
Input: abababab, Substring: ab
Output: 4
 */

package day4;
import java.util.Scanner;
public class Str24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer str=new StringBuffer(sc.next());
		System.out.print("Substring: ");
		String chk=sc.next();
		sc.close();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(i+chk.length()>=str.length()) {
				break;
			}
			else if(str.substring(i, i+chk.length()).equals(chk)) {
				count++;
			}
		}
		System.out.println("Output: "+count);
	}
}
