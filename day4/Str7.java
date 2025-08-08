/*
String – Word Count in Sentence
Question:
Count number of words in a given sentence.
Expected Output:
Input: Java is fun
Word Count: 3
 */

package day4;
import java.util.Scanner;
import java.lang.String;
public class Str7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String s=sc.nextLine();
		sc.close();
		String[] arr=s.split(" ");
		System.out.println("Word Count: "+arr.length);
	}
}
