/*
StringBuilder – Alternate Characters in Upper and Lower Case
Question:
Convert alternate characters to upper and lower case.
Expected Output:
Input: hello
Output: HeLlO
 */

package day4;
import java.util.Scanner;
public class Str23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str=new StringBuilder(sc.next());
		sc.close();
		for(int i=1;i<str.length()+1;i++) {
			if(i%2!=0) {
				str.setCharAt(i-1, Character.toUpperCase(str.charAt(i-1)));
			} else {
				str.setCharAt(i-1, Character.toLowerCase(str.charAt(i-1)));
			}
		}
		System.out.println("Output: "+str);
	}
}
