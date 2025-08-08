/*
String – Check Anagram
Question:
Check if two strings are anagrams.
Expected Output:
Input: listen, silent
Result: Anagram 
 */

package day4;
import java.util.Scanner;
public class Str22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str=sc.nextLine();
		sc.close();
		int[] res=new int[2];
		String[] s=str.split(",");
		for(int j=0;j<s.length;j++) {
			for(int i=0;i<s[j].length();i++) {
				res[j]+=s[j].charAt(i);
			}
		}
		if(res[0]==res[1]) System.out.println("Anagram");
		else System.out.println("Not an Anagram");
	}
}
