/*
LinkedList – Sort Elements
Question:
Write a program to sort integers in a LinkedList.
Expected Output:
Input: [45, 12, 78, 34]
Sorted: [12, 34, 45, 78]
 */

package day8;
import java.util.*;
public class Coll17 {
	public static void main(String[] args) {
		List<Integer> ls=new LinkedList<>(Arrays.asList(45,12,78,34));
		System.out.println("Input: "+ls);
		ls.sort(null);
		System.out.println("Sorted: "+ls);
	}
}
