/*
LinkedList – Add at First and Last
Question:
Write a program to add elements at the beginning and end of a LinkedList.
Expected Output:
List: [20, 30, 40]
After addFirst(10), addLast(50): [10, 20, 30, 40, 50]
 */

package day8;
import java.util.*;
public class Coll15 {
	public static void main(String[] args) {
		List<Integer> ls=new LinkedList<>(Arrays.asList(20,30,40));
		System.out.println("List: "+ls);
		ls.addFirst(10);
		ls.addLast(50);
		System.out.println("After addFirst(10), addLast(50): "+ls);
	}
}
