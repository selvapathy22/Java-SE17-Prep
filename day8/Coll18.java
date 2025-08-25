/*
 LinkedList – Reverse Elements
Question:
Write a program to reverse the order of elements in a LinkedList.
Expected Output:
Input: [1, 2, 3, 4, 5]
Reverse: [5, 4, 3, 2, 1]
 */

package day8;
import java.util.*;
public class Coll18 {
	public static void main(String[] args) {
		List<Integer> ls = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println("Input: "+ls);
		Collections.reverse(ls);
		System.out.println("Reverse: "+ls);
	}
}
