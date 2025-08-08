/*
 StringBuilder – Count Words Ending With a Character
Question:
Count words ending with a specific character (e.g., ‘e’).
Expected Output:
Input: "Java code is nice"
Ending with 'e': 2
 */

package day4;
import java.util.Scanner;
public class Str18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str=new StringBuilder(sc.nextLine());
		System.out.print("Enter character: ");
		char ch=sc.next().charAt(0);
		sc.close();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Ending with '"+ch+"': "+count);
	}
}
