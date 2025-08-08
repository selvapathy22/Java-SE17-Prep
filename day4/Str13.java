/*
StringBuilder – Replace Spaces with Hyphens
Question:
Replace spaces with hyphens in a string.
Expected Output:
Input: Java Programming Language
Output: Java-Programming-Language
 */

package day4;
import java.util.Scanner;
public class Str13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer str=new StringBuffer(sc.next());
		sc.close();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='-') {
				str.replace(i, i+1, " ");
			}
		}
		System.out.println("Output: "+str);
	}
}
