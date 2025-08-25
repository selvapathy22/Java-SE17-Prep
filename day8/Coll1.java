/*
Array – Add Elements and Display
Question:
Write a program that accepts N integers in an array and displays all elements.
Expected Output:
Input: 5 → 10 20 30 40 50
Output: 10 20 30 40 50
 */

package day8;
import java.util.*;

public class Coll1 {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input: ");
		int item=scanner.nextInt();
		for(int i=0;i<item;i++) {
			ls.add(scanner.nextInt());
		}
		System.out.print("Output: ");
		for(int ite:ls) {
			System.out.print(ite+" ");
		}
		scanner.close();
	}
}
