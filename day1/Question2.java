package day1;
import java.util.Scanner;
/*
 Array – Search for an Element

Question:
Write a program to search for an element in the array using linear search.

Expected Output:

Array: 2 4 6 8 10
Search: 8
Result: Found at position 4
 */


public class Question2 {
	public static void main(String[] args) {
		int[] arr;
		System.out.print("Enter array size: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		arr=new int[a];
		for(int i=0;i<a;i++) {
			System.out.print("Enter element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter search element: ");
		int search=sc.nextInt();
		int pos=1;
		boolean nf=false;
		for(int i=0;i<a;i++) {
			if(search==arr[i]) {
				nf=true;
				break;
			} else {
				pos++;
			}
		}
		if(nf) {
			System.out.print("Array: ");
			for(int i=0;i<a;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("Search: "+search);
			System.out.println("Result: Found at position "+pos);
		} else {
			System.out.println("Element not found");
		}
	}
}
