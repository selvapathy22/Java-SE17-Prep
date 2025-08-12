/*
Own Package – Employee Record Management
Question:
Define a package hr and a class Employee with name, id, and salary fields. Use constructors and
a display method. Instantiate and display employee info from a main class.
Expected Output:
Employee Name: Rani
Employee ID: 102
Salary: 45000
 */

package packages;
import hr.Employee;
public class Pack5 {
	public static void main(String[] args) {
		Employee em1=new Employee(102, "Rani", 45000);
		em1.displayDets();
	}
}
