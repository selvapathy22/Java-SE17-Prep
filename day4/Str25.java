/*
StringBuilder – Shift Letters (Caesar Cipher Logic)
Question:
Shift each letter of the string by 1 position (a→b, b→c,... z→a).
Expected Output:
Input: xyz
Output: yza
 */

package day4;
import java.util.Scanner;
public class Str25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		StringBuffer str=new StringBuffer(sc.next());
		sc.close();
		StringBuffer res=new StringBuffer();
		char[] ch=str.toString().toCharArray();
		for(char c:ch) {
			if(c=='z') {
				res.append('a');
			} else if(c=='Z') {
				res.append('Z');
			} else if(c>='a'&&c<='y'){
				res.append((char)(c+1));
			} else if(c>='A'&&c<='Z') {
				res.append((char)(c+1));
			} else {
				res.append(c);
			}
		}
		System.out.println("Output: "+res);
	}
}

 