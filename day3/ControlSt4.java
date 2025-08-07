package day3;
import java.util.Scanner;

/*
Print Numbers Not Divisible by 3 and 5 in a Range
Question:
Using loop and conditional statement, print numbers between 1 and N that are not divisible by
3 or 5.
Sample Input:
Enter N: 20
Expected Output:
Numbers not divisible by 3 or 5: 1 2 4 7 8 11 13 14 16 17 19
 */

public class ControlSt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int a = sc.nextInt();
        System.out.print("Numbers not divisible by 3 or 5 are: ");
        for(int i = 1; i <= a; i++) {
            if(i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
