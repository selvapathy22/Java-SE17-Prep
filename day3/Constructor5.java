/*
Constructor to Sum Digits and Check Even/Odd
Question:
Write a constructor that calculates the sum of digits of a number. Use a method to check if the
sum is even or odd.
Expected Output:
Number: 123 Sum of digits: 6 Sum is even
Or
Online Order System
Question:
Create an Order class with constructor for item, quantity, and unit price. Use method to
calculate total price and apply discount if total > 5000. Print the final bill with conditional logic.
Expected Output:
Item: Laptop
Total: 60000
Discount Applied: 10%
Final Amount: 54000
 */

package day3;
import java.util.Scanner;
public class Constructor5 {
	public Constructor5(int n) {
		int sum=0;
		while(n!=0) {
			int dig=n%10;
			sum+=dig;
			n/=10;
		}
		System.out.println("Sum of digits: "+sum);
		if(sum%2==0) {
			System.out.println("Sum is even");
		} else {
			System.out.println("Sum is odd");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number: ");
		int num=sc.nextInt();
		new Constructor5(num);
	}
}
