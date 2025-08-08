/*
StringBuilder – Remove Duplicates
Question:
Remove duplicate characters from a string using StringBuilder.
Expected Output:
Input: programming
Output: progamin
 */

package day4;
import java.util.Scanner;
public class Str11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str=sc.next();
		char[] charr=str.toCharArray();
		sc.close();
		StringBuilder res=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			boolean notpres=true;
			for(int j=0;j<res.length();j++) {
				if(charr[i]==res.charAt(j)) {
					notpres=false;
				}
			}
			if(notpres) {
				res.append(charr[i]);
			}
		}
		System.out.println("Output: "+res);
	}
}
