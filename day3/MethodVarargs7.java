/*
Reverse Elements
Write a method that prints all integers passed in reverse order using varargs.
Sample Input:
reversePrint(1, 2, 3, 4)
Expected Output:
4 3 2 1
 */

package day3;

public class MethodVarargs7 {
	public void reversePrint(int... num) {
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args) {
		MethodVarargs7 temp=new MethodVarargs7();
		temp.reversePrint(1,2,3,4);
	}
}
