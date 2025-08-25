/*
Stack – Push and Display
Question:
Write a program to push elements onto a stack and display them.
Expected Output:
Stack: [10, 20, 30, 40]
 */

package day8;
import java.util.*;

public class Coll19 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Stack: "+s);
	}
}
