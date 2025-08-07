/*
Multiply Integers
Write a method to multiply all integers passed using varargs.
Sample Input:
multiply(2, 3, 4) Expected Output: 24
 */

package day3;

public class MethodVarargs6 {
	public void multiply(int...num) {
		int res=1;
		for(int n:num) {
			res*=n;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		MethodVarargs6 tem= new MethodVarargs6();
		tem.multiply(2,3,4);
	}
}
