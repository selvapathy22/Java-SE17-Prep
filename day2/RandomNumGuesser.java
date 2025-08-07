package day2;
import java.util.*;

public class RandomNumGuesser {
	public static void main(String[] args) {
		Random r1=new Random();
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			num=r1.nextInt(100);
		} while(num<10);
		//or we can do x=(r1.nextInt(90))+10
		//so that even when 0 is gen it is converted to 10 and 89 is converted to 99
		int temp=0;
		while(temp!=num) {
			System.out.print("Guess the number: ");
			temp=sc.nextInt();
			if(temp==num) {
				System.out.println("Congrats!!! You guessed it :)");
			} else if (temp<num) {
				System.out.println("Try larger number");
			} else {
				System.out.println("Try smaller number");
			}
		}
	}
}