package day2;
import java.util.Scanner;
/*
Discount Eligibility Based on Age and Purchase

Question:
Give 10% discount if age > 60 and purchase > ₹1000, else no discount.

Sample Input:

Enter age: 65
Enter amount: 1200

Expected Output:

Discount Applied: ₹120.0
Final Amount: ₹1080.0
 */

public class Question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age: ");
		byte age=sc.nextByte();
		System.out.print("Enter amount: ");
		float amount=sc.nextFloat();
		if(age>60 && amount>1000) {
			float dis= ((amount/100)*10);
			System.out.println("Discount Applied: "+dis);
			System.out.println("Final Amount: "+(amount-dis));
		} else {
			System.out.println("Discount Applied: 0.0");
			System.out.println("Final Amount: "+amount);
		}
	}
}
