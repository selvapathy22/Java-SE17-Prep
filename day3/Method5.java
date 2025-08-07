/*
Method Overloading for Volume Calculation
Question:
Overload a method to calculate volume for a cube, cylinder, and cuboid. Use the same method
name with different parameter lists.
Sample Input:
Enter side: 3
Enter radius and height: 4 5
Enter length, width, and height: 2 3 4
Expected Output:
Volume of cube: 27
Volume of cylinder: 251.2
Volume of cuboid: 24
 */

package day3;
import java.util.Scanner;
public class Method5 {
	public void volume(float side) {
		System.out.printf("Volume of cube: %.1f%n",side*side*side);
	}
	public void volume(float rad,float hei) {
		System.out.printf("Volume of cylinder: %.1f%n", 3.14*rad*rad*hei);
	}
	public void volume(float len,float width,float hei) {
		System.out.printf("Volume of cuboid: %.1f%n",len*width*hei);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Method5 vol=new Method5();
		System.out.print("Enter side: ");
		float side=sc.nextFloat();
		System.out.print("Enter radius and height: ");
		float rad=sc.nextFloat();
		float hei=sc.nextFloat();
		System.out.print("Enter length, width, and height: ");
		float len=sc.nextFloat();
		float wid=sc.nextFloat();
		float heig=sc.nextFloat();
		vol.volume(side);
		vol.volume(rad,hei);
		vol.volume(len, wid, heig);
		sc.close();
	}
}
