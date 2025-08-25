/*
Queue – Remove (Dequeue) Element
Question:
Write a program to remove the front element from a queue.
Expected Output:
Queue: [100, 200, 300, 400]
After remove → [200, 300, 400]
 */

package day8;
import java.util.*;
public class Coll10 {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		System.out.println("Queue: "+q);
		q.poll();
		System.out.println("After remove -> "+q);
	}
}
