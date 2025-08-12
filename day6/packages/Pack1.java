/*
Packages – Create and Use a User-Defined Package
Question:
Create a package utility with a class MathTools containing a method square(int). Import
this package in another class and use it.
Expected Output:
Input: 6
Square: 36
 */

package packages;
import utility.MathTools;
public class Pack1 {
	public static void main(String[] args) {
		MathTools squar=new MathTools();
		System.out.println(squar.square(3));
	}
}
