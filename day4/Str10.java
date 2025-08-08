/*
StringBuilder – Toggle Case
Question:
Convert uppercase to lowercase and vice versa using StringBuilder.
Expected Output:
Input: JaVa
Output: jAvA
 */

package day4;
import java.util.Scanner;
public class Str10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuilder str = new StringBuilder(sc.next());
		StringBuilder res=new StringBuilder();
		sc.close();
		for(char ch:str.toString().toCharArray()) {
			if(Character.isLowerCase(ch)) {
				res.append(Character.toUpperCase(ch));
			} else {
				res.append(Character.toLowerCase(ch));
			}
		}
		System.out.println("Output: "+res);
	}
}
