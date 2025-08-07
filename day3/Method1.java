/*
Power Calculation Using Method
Question:
Develop a program to calculate the power of a number. The program should prompt the user to
enter the base and the exponent. Create a user-defined method that performs the power
calculation using a loop and returns the result.
Sample Input:
Enter base: 3
Enter exponent: 4
Expected Output: Power: 81
 */

package day3;
import java.util.Scanner;
import java.lang.Math;

public class Method1 {
	public double calculatepower(double a,double b) {
		return Math.pow(a,b);
	}
	public static void main(String[] args) {
		int a,b;
		Method1 cal=new Method1();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base: ");
		a=sc.nextInt();
		System.out.print("Enter exponent: ");
		b=sc.nextInt();
		double res=cal.calculatepower(a,b);
		System.out.println("Power: "+ res);
		sc.close();
	}
}
