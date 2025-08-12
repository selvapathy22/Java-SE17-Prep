/*
Employee Records
Question:
Create a package records containing a class Employee with fields: id, name, salary. In the main
class, create an array of 5 employees and display their details.
Expected Output:
Employee List:
ID: 101, Name: Arun, Salary: 35000
ID: 102, Name: Banu, Salary: 40000
 */

package packages;
import records.Employee;
public class Pack2 {
	public static void main(String[] args) {
		Employee[] objarr=new Employee[5];
		objarr[0]=new Employee(101, "Kratos", 32000);
		objarr[1]=new Employee(102, "Luffy", 2000);
		objarr[2]=new Employee(103, "Saitama", 16000);
		objarr[3]=new Employee(104, "Vincent", 7000);
		objarr[4]=new Employee(105, "Johnny", 2000);
		for(Employee obj:objarr) {
			System.out.printf("ID: %d, Name: %s, Salary: %d\n",obj.id,obj.name,obj.salary);
		}
	}
}
