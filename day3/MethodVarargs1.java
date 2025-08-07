/*
1. Sum of Integers
Write a method using varargs to calculate the sum of any number of integers.
Sample Input:
sum(10, 20, 30)
Expected Output:
60
 */

package day3;

public class MethodVarargs1 {
	public void sum(int... numbers) {
		int tot=0;
		for(int num:numbers) {
			tot+=num;
		}
		System.out.println(tot);
	}
	public static void main(String[] args) {
		MethodVarargs1 meth= new MethodVarargs1();
		meth.sum(10,20,30);
	}
}
