/*
String – Convert Case and Trim
Question:
Demonstrate use of toUpperCase(), toLowerCase(), and trim().
Expected Output:
Input: Hello JAVA
Trimmed: Hello JAVA
Uppercase: HELLO JAVA
Lowercase: hello java
 */

package day4;
import java.util.Scanner;
public class Str6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String str=sc.nextLine();
		sc.close();
		System.out.println("Trimmed: "+str.trim());
		System.out.println("Uppercase: "+str.toUpperCase());
		System.out.println("Lowercase: "+str.toLowerCase());
	}
}
