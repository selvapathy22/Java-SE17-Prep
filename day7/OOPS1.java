/*
Employee Payment System
Create a base class Employee with fields: name and salary. Derive classes ContractEmployee
and PermanentEmployee that override a method calculatePay() based on hourly or monthly
pay.
Sample Output:
Name: John (Contract)
Hours Worked: 120, Hourly Rate: ₹500
Payment: ₹60000.0
Name: Alice (Permanent)
Monthly Salary: ₹75000
Payment: ₹75000.0
 */

package day7;

class Employee {
	String name;
	int salary;
	Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	public double calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}
}
class ContractEmployee extends Employee {
	int hrs;
	ContractEmployee(String name,int salary,int hrs) {
		super(name,salary);
		this.hrs=hrs;
	}
	@Override
	public double calculatePay() {
		return hrs*salary;
	}
}
class PermanentEmployee extends Employee {
	PermanentEmployee(String name,int salary) {
		super(name,salary);
	}
	@Override
	public double calculatePay() {
		return salary;
	}
}

public class OOPS1 {
	public static void main(String[] args) {
		ContractEmployee em1=new ContractEmployee("John",500,120);
		PermanentEmployee em2=new PermanentEmployee("Alice",75000);
		double salem1,salem2;
		salem1=em1.calculatePay();
		salem2=em2.calculatePay();
		System.out.printf("Name: %s (Contract)\nHours Worked: $%d, Hourly Rate: $%d\nPayment: %.1f\n",em1.name,em1.hrs,em1.salary,salem1);
		System.out.printf("Name: %s (Contract)\nMonthly Salary: %d\nPayment: %.1f\n",em2.name,em2.salary,salem2);
	}
}
