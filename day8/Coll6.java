/*
ArrayList – Remove Element
Question:
Write a program to remove an element from an ArrayList.
Expected Output:
List: [Red, Green, Blue, Yellow]
Remove: Blue
Result: [Red, Green, Yellow]
 */

package day8;
import java.util.*;
public class Coll6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> ls=new ArrayList<>();
		ls.add("Red");
		ls.add("Green");
		ls.add("Blue");
		ls.add("Yellow");
		System.out.print("List: ");
		for(String s:ls) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.print("Remove: ");
		String tar=sc.nextLine();
		ls.remove(tar);
		System.out.print("Result: ");
		sc.close();
		for(String s:ls) {
			System.out.print(s+" ");
		}
	}
}
