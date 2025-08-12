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

package records;

public class Employee {
	public int id,salary;
	public String name;
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
