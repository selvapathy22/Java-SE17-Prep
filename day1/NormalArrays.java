package day1;
import java.util.*;

public class NormalArrays {
	public static void main(String[] args) {
/*		int[] arr; //Deceleration
		
		int[] arr1 = new int[5]; //Delcleration with initialization
		
		int[] arr2 = {1,2,3,4,5}; //decleration with initialization and value
		
*/
		Scanner sc=new Scanner(System.in);
		
		int[] arr;
		System.out.print("Enter the values in arr: ");
		
		int a=sc.nextInt();
		arr=new int[a];
		
		for(int i=0;i<a;i++) {
			System.out.print("Enter value "+ (i+1)+":");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("The "+a+" values you entered are: ");
		
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
