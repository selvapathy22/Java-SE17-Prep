/*
Constructor that Filters Positive Numbers from Input
Question:
Accept an array of integers in the constructor. Use a loop to print only positive numbers.
Expected Output:
Input: -1 2 -3 4 5
Positive numbers: 2 4 5
 */

package day3;
import java.util.Scanner;
public class Constructor2 {
	public Constructor2(String s) {
		String[] arr=s.split(" ");
		int[] intval=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			intval[i]=Integer.parseInt(arr[i]);
		}
		System.out.print("Positive numbers: ");
		for(int num:intval) {
			if(num>=0) System.out.print(num+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String s=sc.nextLine();
		new Constructor2(s);
	}
}
