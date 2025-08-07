package day2;
import java.util.Scanner;

/*
Logical AND/OR with Boolean Flags

Question:
Use boolean flags and logical operators to check if both conditions are true.

Sample Input:

isStudent: true

hasIDCard: true

Expected Output: Access Granted
 */

public class Question7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("isStudent: ");
		boolean student=sc.nextBoolean();
		System.out.print("hasIDCard: ");
		boolean id=sc.nextBoolean();
		if(student&id) {
			System.out.println("Access Granted");
		} else {
			System.out.println("Access Denied");
		}
	}
}
