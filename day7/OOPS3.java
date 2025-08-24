/*
 Animal Simulation
Create a base class Animal with attributes name, age. Derive Dog, Cat, and Bird classes with
overridden makeSound() methods. Demonstrate polymorphism.
Sample Output:
Dog (Rocky) says: Woof!
Cat (Misty) says: Meow!
Bird (Tweety) says: Tweet!
 */

package day7;

class Animal {
	String name;
	Animal(String name) {
		this.name=name;
	}
	public void makeSound() {
		
	}
}

class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	@Override
	public void makeSound() {
		System.out.println("Dog: ("+name+") says: Woof!");
	}
}

class Cat extends Animal {
	Cat(String name) {
		super(name);
	}
	@Override
	public void makeSound() {
		System.out.println("Cat: ("+name+") says: Meow!");
	}
}

class Bird extends Animal {
	Bird(String name) {
		super(name);
	}
	@Override
	public void makeSound() {
		System.out.println("Bird: ("+name+") says: Tweet!");
	}
}

public class OOPS3 {
	public static void main(String[] args) {
		Dog dog=new Dog("Rocky");
		Cat cat=new Cat("Misty");
		Bird brb=new Bird("Tweety");
		dog.makeSound();
		cat.makeSound();
		brb.makeSound();
	}
}
