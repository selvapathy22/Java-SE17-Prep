/*
Topper Finder
Question:
Create a package students with class Student having rollNo, name, and marks. Store 5
students in an array and find the topper using a method.
Expected Output:
Topper: Swetha (Marks: 489)
 */

package packages;
import students.Student;
public class Pack3 {
	public static void main(String[] args) {
		Student[] stuobj=new Student[5];
		stuobj[0] = new Student((short) 101,"Swetha",(short)489);
		stuobj[1] = new Student((short) 102,"Varun",(short)488);
		stuobj[2] = new Student((short) 103,"Shobhik",(short)456);
		stuobj[3] = new Student((short) 104,"Yash",(short)432);
		stuobj[4] = new Student((short) 105,"Rini",(short)424);
		byte topindex=0;
		for(byte i=0;i<5;i++) {
			if(stuobj[i].marks>stuobj[topindex].marks) {
				topindex=i;
			}
		}
		System.out.println("Topper: "+stuobj[topindex].name+" (Marks: "+stuobj[topindex].marks+")");
	}
}
