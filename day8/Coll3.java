/*
Array – Sort in Ascending Order
Question:
Write a program to sort an array in ascending order.
Expected Output:
Input: 12 5 9 1 4
Sorted: 1 4 5 9 12
 */

package day8;
import java.util.*;
public class Coll3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String[] ip=sc.nextLine().split(" ");
		sc.close();
		List<Integer> ls=new ArrayList<Integer>();
		for(String i:ip) {
			ls.add(Integer.parseInt(i));
		}
		Collections.sort(ls);
		System.out.print("Sorted: ");
		for(Integer i:ls) {
			System.out.print(i+" ");
		}
	}
}
