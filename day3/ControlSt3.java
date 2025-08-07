package day3;
import java.util.Scanner;

/*
Print Diamond Star Pattern
Question:
Print a diamond shape star pattern for a given number of rows.
Sample Input: Enter number of rows: 3
Expected Output:
*
***
*****
***
*
 */

public class ControlSt3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i=1;i<=rows;i++) {
            for (int j=1;j<=rows-i;j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=rows-1;i>=1;i--) {
            for (int j=1; j<=rows-i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
	}
}
