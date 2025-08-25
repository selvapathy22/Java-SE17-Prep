/*
Queue – Sort Elements
Question:
Write a program to sort elements of a queue in ascending order.
Expected Output:
Input: [40, 10, 20, 30]
Sorted: [10, 20, 30, 40]
 */

package day8;
import java.util.*;
public class Coll11 {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(40);
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println("Input: "+q);
		List<Integer> ls=new LinkedList<>(q);
		Collections.sort(ls);
		q.clear();
		q.addAll(ls);
		System.out.println("Sorted: "+q);
	}
}
