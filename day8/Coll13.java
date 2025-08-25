/*
PriorityQueue – Add and Display (Min-Heap)
Question:
Write a program to insert integers into a PriorityQueue and display them in priority order.
Expected Output:
Input: 30, 10, 20, 40
Output (poll order): 10 20 30 40
 */

package day8;
import java.util.*;

public class Coll13 {
	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(30);
		q.add(10);
		q.add(20);
		q.add(40);
		System.out.print("Output (Poll order): ");
		for(int i=0;i<4;i++) {
		System.out.print(q.poll()+" ");
		}
	}
}
