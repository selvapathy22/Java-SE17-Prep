/*
Count Even Numbers
Write a method to count how many even numbers are passed as varargs.
Sample Input:
countEvens(1, 2, 3, 4, 6, 7)
Expected Output:
3
 */

package day3;

public class MethodVarargs4 {
	public void countEvens(int...num) {
		byte count=0;
		for(int n:num) {
			if(n%2==0) count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		MethodVarargs4 tem=new MethodVarargs4();
		tem.countEvens(1,2,3,4,6,7);
	}
}