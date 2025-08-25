/*
LinkedList – Remove First and Last
Question:
Write a program to remove the first and last elements of a LinkedList.
Expected Output:
List: [100, 200, 300, 400, 500]
After removeFirst(), removeLast(): [200, 300, 400]
 */

package day8;
import java.util.*;
public class Coll16 {
	public static void main(String[] args) {
		List<Integer> ls=new LinkedList<>(Arrays.asList(100,200,300,400,500));
		System.out.println("List: "+ls);
		ls.removeFirst();
		ls.removeLast();
		System.out.println("After removeFirst(), removeLast(): "+ls);
	}
}
