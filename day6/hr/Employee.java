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

package hr;

public class Employee {
	public String name;
	public int id,salary;
	public Employee(int id,String name,int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDets() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Salary: "+salary);
	}
}
