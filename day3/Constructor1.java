/*
Constructor to Count Vowels in a String
Question:
Write a constructor that accepts a string, counts the number of vowels using a loop, and prints
the count.
Expected Output:
Input: education, Vowel Count: 5
 */

package day3;
import java.util.Scanner;
public class Constructor1 {
	Constructor1(String s) {
		int vow=0;
		s=s.toLowerCase();
		char[] str=s.toCharArray();
		for(char c:str) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vow++;
			}
		}
		System.out.println("Vowel Count: "+vow);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str=sc.next();
		new Constructor1(str);
		sc.close();
	}
}
