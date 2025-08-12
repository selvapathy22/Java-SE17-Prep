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

package datastructures;

public class SortTools {
	public static int[] SortDes(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] SortAcs(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
