/*
 PriorityQueue – Remove Element
Question:
Write a program to remove the smallest element from a PriorityQueue.
Expected Output:
Queue: [5, 15, 25, 10]
After remove: [10, 15, 25]
 */

package day8;
import java.util.*;
public class Coll14 {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(5);
		q.add(15);
		q.add(25);
		q.add(10);
		System.out.println("Queue: "+q);
		q=new PriorityQueue<>(q);
		q.poll();
		System.out.println("After remove: "+q);
	}
}
