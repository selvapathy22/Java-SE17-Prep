/*
Static Method to Convert Minutes to Hours
Question:
Write a static method that accepts minutes and converts it to hours and minutes format.
Sample Input:
Enter minutes: 125
Expected Output: Converted Time: 2 hour(s) 5 minute(s)
 */

package day3;
import java.util.Scanner;
public class Method3 {
	static int minutes;
	Method3(int a) {
		Method3.minutes=a;
	}
	public static void converttime() {
		System.out.println("Converted Time: "+minutes/60+" hour(s) "+minutes%60+" minute(s)");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minutes: ");
		int a=sc.nextInt();
		Method3 time=new Method3(a);
		converttime();
		sc.close();
	}
}
