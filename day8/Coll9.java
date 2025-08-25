/*
Queue – Add (Enqueue) and Display
Question:
Write a program to add elements into a queue and display them.
Expected Output:
Queue: [10, 20, 30]
 */

package day8;
import java.util.*;
public class Coll9 {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println("Queue: "+q);
	}
}
