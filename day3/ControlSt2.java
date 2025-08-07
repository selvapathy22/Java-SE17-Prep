package day3;

import java.util.Scanner;

/*
Number Pattern Printing
Question:
Write a Java program to print the following number pattern using nested for loops:
Sample Input:
Enter number of rows: 4
Expected Output:
1
1 2
1 2 3
1 2 3 4
OR
Expected Output:
1 2 3 4
1 2 3
1 2
1
*/
public class ControlSt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int s = sc.nextInt();
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
