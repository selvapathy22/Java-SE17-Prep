/*
ArrayList – Sort Alphabetically
Question:
Write a program to sort an ArrayList of strings alphabetically.
Expected Output:
Input: [Mango, Apple, Orange, Banana]
Sorted: [Apple, Banana, Mango, Orange]
 */

package day8;
import java.util.*;
public class Coll7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String[] arr=sc.nextLine().split(" ");
		List<String> ls=new ArrayList<>();
		sc.close();
		for(String s:arr) {
			ls.add(s);
		}
		Collections.sort(ls);
		System.out.println("Sorted: "+ls);
	}
}
