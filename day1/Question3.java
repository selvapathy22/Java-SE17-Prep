package day1;
import java.util.Scanner;
/*
Marks – Calculate Percentage and Grade

Question:
Create a program to accept marks for 5 subjects, calculate total and percentage, and assign grade using if-else.

Expected Output:

Marks: 80 85 90 75 95
Total: 425
Percentage: 85.0%
Grade: A
 */

public class Question3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int tot=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Marks: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			tot+=arr[i];
		}
		System.out.println("Total: "+tot);
		float per=tot/5;
		System.out.println("Percentage: "+per+"%");
		int perc=(int) per;
		if(perc>=85) {
			System.out.println("Grade: A");
		} else if(perc<85 && perc>=60) {
			System.out.println("Grade: B");
		} else if(perc<60 && perc>=45) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: F");
		}
	}
}
