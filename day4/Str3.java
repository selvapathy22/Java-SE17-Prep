/*
String – Vowel and Consonant Count
Question:
Accept a string and count vowels and consonants.
Expected Output:
Input: Hello World
Vowels: 3
Consonants: 7
 */

package day4;
import java.util.Scanner;
import java.lang.String;
public class Str3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str=new StringBuilder(sc.nextLine());
		sc.close();
		String s=str.toString();
		s=s.toLowerCase();
		int vow=0,cons=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vow++;
			} else if(s.charAt(i)==' ') {
				continue;
			} else {
				cons++;
			}
		}
		System.out.println("Vowels: "+vow+"\nConsonants: "+cons);
	}
}
