/*
Find Maximum Number
Write a method to find the maximum among a set of double values passed using varargs.
Sample Input:
findMax(2.3, 5.5, 1.1, 9.9)
Expected Output:
9.9
 */

package day3;

public class MethodVarargs3 {
	public void findMax(double... numbers) {
		double max=0;
		for(double num:numbers) {
			if(num>max) max=num;
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		MethodVarargs3 temp=new MethodVarargs3();
		temp.findMax(2.3,5.5,1.1,9.9);;
	}
}
