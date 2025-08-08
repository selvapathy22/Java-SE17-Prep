/*
StringBuffer – Remove Vowels
Question:
Remove all vowels from a string using StringBuffer.
Expected Output:
Input: Education
Output: dctn
 */

package day4;
import java.util.Scanner;
public class Str12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer str=new StringBuffer(sc.next());
		sc.close();
		char[] s=str.toString().toLowerCase().toCharArray();
		StringBuffer res= new StringBuffer();
		for(int i=0;i<s.length;i++) {
			if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u') {
				continue;
			} else {
				res.append(s[i]);
			}
		}
		System.out.println("Output: "+res);
	}
}
