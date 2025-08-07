/*
Final Class Demonstration
Question:
Create a final class and attempt to inherit it in another class. Display compilation error message.
Expected Output:
Compile-time error: Cannot inherit from final class
 */

package day3;
final class example {
	public void display() {
		System.out.println("This is a final class");
	}
}
class inherit extends example {
	public void display() {
		System.out.println("Inherited display");
	}
}
public class Method6 {
	public static void main(String[] args) {
		inherit ex=new inherit();
		ex.display();
	}
}
