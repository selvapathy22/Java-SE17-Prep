/*
Multi-Vehicle Modeling
Question:
Develop a program to model different types of vehicles. Create a base class Vehicle with
common attributes (make, model, year). Derive classes Car, Motorcycle, and Truck with their
specific attributes and methods (e.g., loadCapacity for Truck, gearCount for Motorcycle).
Implement method overriding and polymorphic behavior.
 */

package day5;
class Vehicle {
	String make;
	String model;
	short year;
	Vehicle(String make,String model,short year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
}
class Car extends Vehicle{
	String color;
	Car(String make,String model,short year,String color) {
		super(make,model,year);
		this.color=color;
	}
	public void displayInfo() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Color: "+color);
	}
}
class Motorcycle extends Vehicle {
	byte gear;
	Motorcycle(String make,String model,short year,byte gear) {
		super(make,model,year);
		this.gear=gear;
	}
	public void displayInfo() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Gear count: "+gear);
	}
}
class Truck extends Vehicle {
	int loadcap;
	Truck(String make,String model,short year,int loadcap) {
		super(make,model,year);
		this.loadcap=loadcap;
	}
	public void displayInfo() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		System.out.println("Load Capacity: "+loadcap+" Tons");
	}
}
public class Inheri2 {
	public static void main(String[] args) {
		Car car1=new Car("Ferrari","FRI001",(short) 1999,"Red");
		Motorcycle MC1=new Motorcycle("Hero","HER001",(short) 2020,(byte) 5);
		Truck t1=new Truck("BMW","BMW001",(short) 2023,15000);
		car1.displayInfo();
		MC1.displayInfo();
		t1.displayInfo();
	}
}
