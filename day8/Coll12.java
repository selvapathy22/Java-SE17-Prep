/*
Queue – Reverse Queue
Question:
Write a program to reverse the elements of a queue.
Expected Output:
Input: [1, 2, 3, 4]
Reverse: [4, 3, 2, 1]
 */

package day8;
import java.util.*;
public class Coll12 {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		List<Integer> ls=new ArrayList<>(q);
		Collections.reverse(ls);
		Queue<Integer> rev=new LinkedList<>(ls);
		System.out.println("Input: "+q);
		System.out.println("Reverse: "+rev);
	}
}
