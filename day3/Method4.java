/*
Method to Reverse Words in a Sentence
Question:
Write a method that accepts a sentence and returns the sentence with words reversed but in
the same order.
Sample Input: Enter sentence: Hello World Java
Expected Output: Reversed sentence: olleH dlroW avaJ
 */

package day3;
import java.util.Scanner;
public class Method4 {
	String str;
	Method4(String str) {
		this.str=str;
	}
	public String reverseword(String word) {
		String res="";
		for(int i=word.length()-1;i>=0;i--) {
			res+=word.charAt(i); 
		}
		return res;
	}
	public String reversesentence() {
		String[] word=str.split(" ");
		String res="";
		for(int i=0;i<word.length;i++) {
			res+=reverseword(word[i]);
			res+=" ";
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String str=sc.nextLine();
		Method4 meth=new Method4(str);
		String res=meth.reversesentence();
		System.out.println(res);
		sc.close();
	}
}
