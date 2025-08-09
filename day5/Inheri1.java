/*
Employee Payment System
Question:
Create a base class Employee with fields: name and salary. Derive class ContractEmployee and
PermanentEmployee that override a method calculatePay() based on hourly or monthly pay.
 */

package day5;
class Employee {
	String name;
	int salaryperhrs;
	Employee(String name,int salary) {
		this.name=name;
		this.salaryperhrs=salary;
	}
	public int calculatePay(int year) {
		return salaryperhrs*year*12*30*8;//year-months-days-workhrs
	}
}
class ContractEmployee extends Employee {
	ContractEmployee(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int calculatePay(int hrs) {
		return salaryperhrs*hrs;//only hr pay
	}
}
class PermanentEmployee extends Employee {
	PermanentEmployee(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int calculatePay(int months) {
		return salaryperhrs*months*4*7*8;//months-days-workhrs
	}
}
public class Inheri1 {
	public static void main(String[] args) {
		ContractEmployee ce1=new ContractEmployee("varun", 1000);
		ContractEmployee ce2=new ContractEmployee("brad", 1500);
		PermanentEmployee pe1=new PermanentEmployee("sive", 2000);
		PermanentEmployee pe2=new PermanentEmployee("felix", 2500);
		System.out.println("Salary of "+ce1.name+" in 25 hrs: "+ce1.calculatePay(25));
		System.out.println("Salary of "+ce2.name+" in 20 hrs: "+ce2.calculatePay(20));
		System.out.println("Salary of "+pe1.name+" in 3 months: "+pe1.calculatePay(3));
		System.out.println("Salary of "+pe2.name+" in 12 months: "+pe2.calculatePay(12));

	}
}
