/*
Animal Simulation
Question:
Create a base class Animal with general attributes (name, age). Derive classes Dog, Cat, and
Bird with their own sounds and actions. Include a method makeSound() that is overridden in
each subclass. Demonstrate polymorphism by calling makeSound() from an Animal reference.
 */

package day5;
class Animal {
	String name;
	byte age;
	Animal(String name,byte age) {
		this.name=name;
		this.age=age;
	}
	public void makeSound() {
		System.out.println("Common Animal Sound");
	}
}
class Dog extends Animal{
	Dog(String name,byte age) {
		super(name,age);
	}
	@Override
	public void makeSound() {
		System.out.println("Bark!Bark!Bark!");
	}
}
class Cat extends Animal{
	Cat(String name, byte age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("Meow!Meow!Meow!");
	}
}
class Bird extends Animal{
	Bird(String name, byte age) {
		super(name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("Chip!Chip!Chip!");
	}
}
public class Inheri3 {
	public static void main(String[] args) {
		Dog dog=new Dog("Dony",(byte)10);
		Cat cat=new Cat("Zeus",(byte)7);
		Bird bird=new Bird("Jormungander",(byte)100);
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}
