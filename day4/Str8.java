/*
String – Reverse Each Word
Question:
Reverse each word in the sentence.
Expected Output:
Input: Java Code
Output: avaJ edoC
 */

package day4;
import java.util.Scanner;
import java.lang.String;
public class Str8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str=new StringBuilder(sc.nextLine());
		sc.close();
		StringBuilder res=new StringBuilder();
		String[] temp=str.toString().split(" ");
		for(String s:temp) {
			char[] tem=s.toCharArray();
			for(int i=s.length()-1;i>=0;i--) {
				res.append(tem[i]);
			}
			res.append(" ");
		}
		System.out.println(res);
	}
}
