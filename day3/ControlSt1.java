package day3;
import java.util.Scanner;
/*
Reverse Digits of a Number
Question:
Write a Java program to reverse the digits of a given number.
Sample Input:
Enter number: 1234
Expected Output:
Reversed number: 4321
 */
public class ControlSt1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int s=sc.nextInt();
        int revnum=0;
        while(s!=0) {
            int temp=s%10;
            revnum=revnum*10+temp;
            s/=10;
        }
        System.out.println("Reversed Number: "+revnum);
        sc.close();
	}
}
