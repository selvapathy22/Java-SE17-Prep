/*
StringBuilder – Compress String by Character Count
Question:
Write a method using StringBuilder to compress a string (e.g., aabcccccaaa → a2b1c5a3).
Expected Output:
Input: aabcccccaaa
Output: a2b1c5a3
 */

package day4;
import java.util.Scanner;
public class Str2 {
	public static void main(String[] args) {
		System.out.print("Input: ");
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(sc.next());
		sc.close();
		StringBuilder res=new StringBuilder();
		int count=1,i=1;
		for(i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			} else {
				res=res.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		res=res.append(str.charAt(i-1)).append(count);
		System.out.println("Output: "+res);
	}
}
