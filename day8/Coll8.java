/*
ArrayList – Reverse Order
Question:
Write a program to display an ArrayList in reverse order.
Expected Output:
Input: [1, 2, 3, 4, 5]
Reverse: [5, 4, 3, 2, 1]
 */

package day8;
import java.util.*;

public class Coll8 {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		System.out.println("Input: "+ls);
		Collections.reverse(ls);
		System.out.println("Reverse: "+ls);
	}
}
