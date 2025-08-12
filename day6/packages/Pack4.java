/*
Own Package – Custom Sorting Utility
Question:
Create a package datastructures containing a class SortTools with static methods to sort
arrays in ascending and descending order. Import and test with an integer array.
Expected Output:
Original: 5 2 8 1
Ascending: 1 2 5 8
Descending: 8 5 2 1
 */

package packages;
import datastructures.SortTools;
public class Pack4 {
	public static void main(String[] args) {
		int[] arr= {5,2,8,1};
		System.out.print("Original: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		SortTools sc=new SortTools();
		int[] ascarr=sc.SortAcs(arr);
		System.out.print("Ascending: ");
		for(int it:ascarr) {
			System.out.print(it+" ");
		}
		System.out.println();
		int[] desarr=sc.SortDes(arr);
		System.out.print("Descending: ");
		for(int it:desarr) {
			System.out.print(it+" ");
		}
	}
}
