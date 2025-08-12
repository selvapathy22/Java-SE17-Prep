/*
Topper Finder
Question:
Create a package students with class Student having rollNo, name, and marks. Store 5
students in an array and find the topper using a method.
Expected Output:
Topper: Swetha (Marks: 489)
 */

package students;

public class Student {
	public short roll,marks;
	public String name;
	public Student(short roll,String name,short marks) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
}
