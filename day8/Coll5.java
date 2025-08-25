/*
ArrayList – Add Elements
Question:
Write a program to add 5 integers into an ArrayList and display them.
Expected Output:
ArrayList: [10, 20, 30, 40, 50]
 */

package day8;
import java.util.*;
public class Coll5 {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		System.out.print("ArrayList: ");
		for(Integer i:ls) {
			System.out.print(i+" ");
		}
	}
}
