/*
StringBuilder – Insert and Delete Characters
Question:
Demonstrate insert and delete operations on a StringBuilder string.
Expected Output:
Original: JavaLab
After Insert: Java123Lab
After Delete: JavaLab
 */

package day4;
public class Str1 {
	public static void main(String[] args) {
		StringBuilder str= new StringBuilder(50);
		str=str.append("JavaLab");
		str=str.insert(4, "123");
		System.out.println("After Insert: "+str);
		str=str.delete(4, 7);
		System.out.println("After Delete: "+str);
	}
}
