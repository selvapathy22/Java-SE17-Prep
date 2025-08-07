package day1;
import java.util.Scanner;
/*
Matrix – Add Two Matrices

Question:
Write a program to accept two 3x3 matrices from the user and display their sum.

Expected Output:

Matrix A:
1 2 3
4 5 6
7 8 9
Matrix B:
9 8 7
6 5 4
3 2 1
Sum:
10 10 10
10 10 10
10 10 10

Or

Matrix – Check Magic Square

Question:
Create a method to check if a 3x3 matrix is a magic square (all rows, columns, and diagonals have the same sum).

Expected Output:

Matrix:
2 7 6
9 5 1
4 3 8
Result: It is a Magic Square
 */


public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr;
		System.out.print("Enter the size: ");
		int a=sc.nextInt();
		arr=new int[a][a];
		System.out.println("Matrix:");
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int[] row=new int[a];
		int[] col=new int[a];
		int[] dia=new int[2];
		for(int i=0;i<a;i++) {
			int temp=0;
			for(int j=0;j<a;j++) {
				temp+=arr[i][j];
			}
			row[i]=temp;
		}
		for(int i=0;i<a;i++) {
			int temp=0;
			for(int j=0;j<a;j++) {
				temp+=arr[j][i];
			}
			col[i]=temp;
		}
		int diatemp=0;
		for(int i=0;i<a;i++) {
			diatemp+=arr[i][i];
		}
		dia[0]=diatemp;
		diatemp=0;
		for(int i=a-1;i>=0;i--) {
			diatemp+=arr[i][a-1-i];
		}
		dia[1]=diatemp;
		boolean res=true;
		int targetsum=row[0];
		for(int i=0;i<a;i++) {
			if(row[i]!=targetsum || col[i]!=targetsum || dia[0]!=dia[1]) {
				res=false;
				break;
			}
		}
		if(res==true) {
			System.out.println("It is a magic square");
		} else {
			System.out.println("Not a magic square");
		}
	}
}
