/*
Average of Numbers
Write a method to find the average of numbers passed using varargs.
Sample Input:
average(10, 20, 30, 40)
Expected Output:
25.0
 */

package day3;

public class MethodVarargs8 {
	public void average(double...ds) {
		double tot=0;
		for(double d:ds) {
			tot+=d;
		}
		System.out.println(tot/ds.length);
	}
	public static void main(String[] args) {
		MethodVarargs8 tem=new MethodVarargs8();
		tem.average(10,20,30,40);
	}
}
