package day2;
import java.util.Scanner;

public class Question2ver1 {
	public static boolean isPrime(int a) {
		if(a==0 || a==1 || a<0) {
			return false;
		} else {
			for(int i=2;i<=Math.sqrt(a);i++) {
				if(a%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter limit 1: ");
		int a=sc.nextInt();
		System.out.print("Enter limit 2: ");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("Not a valid range");
		} else {
			System.out.print("The prime numbers are: ");
			for(int i=a;i<=b;i++) {
				if(isPrime(i)) {
					System.out.print(i+" ");
				}
			}
		}
	}
}
