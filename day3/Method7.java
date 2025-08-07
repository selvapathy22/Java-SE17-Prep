/*
Count Digit Frequency in Number
Question:
Read an integer and count how many times each digit appears.
Sample Input:
Enter number: 12233445
Expected Output:
Digit 1: 1 time
Digit 2: 2 times
Digit 3: 2 times
Digit 4: 2 times
Digit 5: 1 time
 */

package day3;
import java.util.Scanner;
public class Method7 {
	int[][] count=new int[9][2];
	public int dig(int a) {
		return a%10;
	}
	public int[][] calcount(int a) {
		while(a!=0) {
			int dig=dig(a);
			count[dig-1][1]+=1;
			a/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		Method7 meth=new Method7();
		int[][] res=new int[9][2];
		res=meth.calcount(num);
		for(int i=0;i<9;i++) {
			if(res[i][1]>0) {
				System.out.println("Digit "+(i+1)+": "+res[i][1]+" times");
			}
		}
	}
}
