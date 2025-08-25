/*
Array – Reverse Elements
Question:
Write a program to reverse the elements of an array.
Expected Output:
Input: 11 22 33 44
Reverse: 44 33 22 11
 */

package day8;
import java.util.*;

public class Coll4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String[] str=sc.nextLine().split(" ");
		sc.close();
		List<Integer> ls=new ArrayList<>();
		for(String s:str) {
			ls.add(Integer.parseInt(s));
		}
		Collections.reverse(ls);
		System.out.print("Reverse: ");
		for(int i:ls) {
			System.out.print(i+" ");
		}
	}
}
