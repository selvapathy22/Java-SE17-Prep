/*
Stack – Sort Stack
Question:
Write a program to sort a stack in ascending order.
Expected Output:
Input: [40, 10, 30, 20]
Sorted: [10, 20, 30, 40]
 */

package day8;
import java.util.*;
public class Coll21 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		Collections.addAll(s,40,10,30,20);
		System.out.println("Input: "+s);
		s.sort(null);
		System.out.println("Sorted: "+s);
	}
}
