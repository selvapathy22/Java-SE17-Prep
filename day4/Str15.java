/*
 StringBuilder – Longest Word in Sentence
Question:
Find the longest word in a sentence.
Expected Output:
Input: Java Python JavaScript
Longest Word: JavaScript
 */

package day4;
import java.util.Scanner;
public class Str15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str=new StringBuilder(sc.nextLine());
		sc.close();
		String[] s=str.toString().split(" ");
		String longest=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>longest.length()) {
				longest=s[i];
			}
		}
		System.out.println("Output: "+longest);
	}
}
