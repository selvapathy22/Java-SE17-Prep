package day2;
import java.util.Scanner;

/*
Maximum of Three Numbers

Find the largest among three numbers

Sample Input:

Enter a: 15

Enter b: 25

Enter c: 20                Expected Output:Maximum: 25
 */

public class Question5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		System.out.print("Enter c: ");
		int c=sc.nextInt();
		int res=a>b?a>c?a:c:b>c?b:c;
		System.out.println("Maximum: "+res);
	}
}
