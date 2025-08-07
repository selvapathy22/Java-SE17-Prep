/*
Factorial Calculation with Return Method
Question:
Develop a program to calculate the factorial of a number. Create a method that takes an
integer as input and returns its factorial using iterative logic. Use the method to calculate and
display the factorial value for the input number.
 */

package day3;
import java.util.Scanner;
public class Method2 {
	public int calfact(int a) {
		if(a==1 || a==0) return 1;
		else return a*calfact(a-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Method2 fact=new Method2();
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		int res=fact.calfact(a);
		System.out.print("Factorial: "+res);
		sc.close();
	}
}
