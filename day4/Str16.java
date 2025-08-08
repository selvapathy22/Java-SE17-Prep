/*
String – Remove Digits
Question:
Remove digits from a string.
Expected Output:
Input: abc123xyz45
Output: abcxyz
 */

package day4;
import java.util.Scanner;
public class Str16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer str=new StringBuffer(sc.next());
		sc.close();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				str.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("Output: "+str);
	}
}
