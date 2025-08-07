package day1;
import java.util.Scanner;
/*
Array – Find Maximum Value

Question:
Write a program that accepts 10 integers in an array and finds the maximum value using a loop.

Expected Output:

Input: 23 11 56 89 12 4 77 90 2 14
Maximum: 90

or

Array – Count Even and Odd Numbers

Question:
Create a program that takes N integers into an array and prints the count of even and odd numbers.

Expected Output:

Input: 10 15 22 33 40
Even: 3, Odd: 2
 */

public class Question1 {
	public static void main(String[] args) {
		int[] arr;
		int odd=0,even=0;
		System.out.print("Enter array size: ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		arr=new int[a];
		for(int i=0;i<a;i++) {
			System.out.print("Enter array value "+(i+1)+":");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even: "+even+",Odd: "+odd);
	}
}
