/*
Constructor Overloading to Calculate Circle Area and Perimeter
Question:
Overload constructors to calculate area and perimeter of a circle. One constructor accepts
radius; another accepts diameter.
Expected Output:
Area: 78.5
Perimeter: 31.4
 */

package day3;

public class Constructor4 {
	public Constructor4(double rad) {
		System.out.printf("Area: %.1f\nPerimeter: %.1f%n", (3.14 * rad * rad), (2 * 3.14 * rad));
	}
	public Constructor4(int dia) {
		double rad = dia / 2.0;
		System.out.printf("Area: %.1f\nPerimeter: %.1f%n", (3.14 * rad * rad), (2 * 3.14 * rad));
	}
	public static void main(String[] args) {
		new Constructor4(5.0);
		new Constructor4(10);
	}
}
