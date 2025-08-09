/*
Shape Framework
Question:
Develop a program to model different shapes. Create an abstract class Shape with an abstract
method calculateArea() and calculatePerimeter(). Extend this class with Rectangle,
Circle, and Triangle. Each shape class should have constructors, overridden methods, and
validation for dimension inputs.
 */

package day5;
abstract class Shape {
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}
class Rectangle extends Shape {
	double l,w;
	Rectangle(double length,double width) {
		this.l=length;
		this.w=width;
	}
	@Override
	public double calculateArea() {
		return l*w;
	}
	@Override
	public double calculatePerimeter() {
		return 2*(l+w);
	}
}
class Triangle extends Shape {
	double base,height,hyp;
	Triangle(double base,double height,double hypotenuse) {
		this.base=base;
		this.height=height;
		this.hyp=hypotenuse;
	}
	@Override
	public double calculateArea() {
		return 1/2*base*height;
	}
	@Override
	public double calculatePerimeter() {
		return base+height+hyp;
	}
}
class Circle extends Shape {
	double rad,dia;
	Circle(double rad) {
		this.rad=rad;
		this.dia=rad*2;
	}
	@Override
	public double calculateArea() {
		return Math.PI*(rad*rad);
	}

	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*dia;
	}
	
}
public class Inheri6 {
	public static void main(String[] args) {
		Rectangle rec=new Rectangle(5, 10);
		Triangle tri=new Triangle(2,3,13);
		Circle cir=new Circle(5);
		System.out.println("Rectangle: ");
		System.out.println("Area: "+rec.calculateArea()+" Perimeter: "+rec.calculatePerimeter());
		System.out.println("Triangle: ");
		System.out.println("Area: "+tri.calculateArea()+" Perimeter: "+tri.calculatePerimeter());
		System.out.println("Circle: ");
		System.out.printf("Area: %.2f Perimeter: %.2f",cir.calculateArea(),cir.calculatePerimeter());
	}
}
