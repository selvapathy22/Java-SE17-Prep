/*
Stack – Reverse Stack
Question:
Write a program to reverse the order of elements in a stack.
Expected Output:
Input: [1, 2, 3, 4]
Reverse: [4, 3, 2, 1]
 */

package day8;
import java.util.*;
public class Coll22 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		Collections.addAll(s,1,2,3,4);
		System.out.println("Input: "+s);
		Collections.reverse(s);
		System.out.println("Reverse: "+s);
	}
}