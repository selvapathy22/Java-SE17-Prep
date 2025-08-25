/*
Stack – Pop Element
Question:
Write a program to pop the top element from a stack.
Expected Output:
Stack: [1, 2, 3, 4, 5]
Pop: 5
Remaining: [1, 2, 3, 4]
 */

package day8;
import java.util.*;
public class Coll20 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.addAll(Arrays.asList(1,2,3,4,5));
		System.out.println("Stack: "+s+"\nPop: "+s.pop());
		System.out.println("Remaining: "+s);
	}
}
