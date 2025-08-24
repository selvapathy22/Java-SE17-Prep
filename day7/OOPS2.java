/*
Multi-Vehicle Modeling
Create a base class Vehicle with attributes make, model, year. Derive classes Car,
Motorcycle, and Truck with their specific attributes. Implement polymorphism for a
displayDetails() method.
Sample Output:
Car: Toyota Corolla (2022), Seats: 5
Motorcycle: Yamaha R15 (2021), Gears: 6
Truck: Tata LPT (2020), Load Capacity: 15000 kg
 */

package day7;

class Vehicle {
	String make,model;
	int year;
	Vehicle(String make,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public void displayDetails() {
		
	}
}

class Car extends Vehicle {
	int seat;
	Car(String make,String model,int year,int seat) {
		super(make,model,year);
		this.seat=seat;
	}
	@Override
	public void displayDetails() {
		System.out.println("Car: "+make+" "+model+" ("+year+") , Seats: "+seat);
	}
}

class Motorcycle extends Vehicle {
	int gear;
	Motorcycle(String make,String model,int year,int gear) {
		super(make,model,year);
		this.gear=gear;
	}
	@Override
	public void displayDetails() {
		System.out.println("Motorcycle: "+make+" "+model+" ("+year+") , Gears: "+gear);
	}
}

class Truck extends Vehicle {
	int lc;
	Truck(String make,String model,int year,int lc) {
		super(make,model,year);
		this.lc=lc;
	}
	@Override
	public void displayDetails() {
		System.out.println("Truck: "+make+" "+model+" ("+year+") , Load Capacity: "+lc+" kg");
	}
}

public class OOPS2 {
	public static void main(String[] args) {
		Car car=new Car("Toyota","Corolla",2022,5);
		Motorcycle mc=new Motorcycle("Yamaha","R15",2021,6);
		Truck tr=new Truck("Tata","LPT",2020,15000);
		car.displayDetails();
		mc.displayDetails();
		tr.displayDetails();
	}
}
