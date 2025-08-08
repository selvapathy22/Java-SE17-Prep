/*
StringBuffer – Reverse Words Order
Question:
Reverse the order of words in a sentence.
Expected Output:
Input: Java is powerful
Output: powerful is Java
 */

package day4;
import java.util.Scanner;
public class Str17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer str=new StringBuffer(sc.nextLine());
		sc.close();
		String[] s=str.toString().split(" ");
		System.out.print("Output: ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}
}
