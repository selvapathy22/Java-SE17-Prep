/*
String – Check for Pangram
Question:
Check if a string contains all letters from A-Z.
Expected Output:
Input: The quick brown fox jumps over the lazy dog
Output: Pangram
 */

package day4;
import java.util.Scanner;
public class Str19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String s=new String(sc.nextLine().toLowerCase());
		sc.close();
		boolean[] ispan=new boolean[26];
		int count=0;
		for(int i=0;i<s.length();i++) {
			int pos=s.charAt(i)-'a';
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				if(ispan[pos]==false) {
					ispan[pos]=true;
					count++;
				}
			}
		}
		if(count==26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a pangram");
		}
	}
}
