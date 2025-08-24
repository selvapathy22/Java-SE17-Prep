/*
E-Commerce System
Demonstrate multilevel inheritance: Platform → Order → Payment. Override methods to
display site info, order details, and payment confirmation.
Sample Output:
Platform: ShopEasy
Order Created: Wireless Mouse
Amount: ₹799.0
Payment Done via UPI for ₹799.0
 */

package day7;

class Platform {
	public void display() {
		System.out.println("Platform: ShopEasy");
	}
}

class Order extends Platform {
	@Override
	public void display() {
		super.display();
		System.out.println("Order Created: Wireless Mouse");
	}
}

class Payment extends Order {
	@Override
	public void display() {
		super.display();
		System.out.println("Amount: $799.0");
		System.out.println("Payment Done via UPI for $799.0");
	}
}

public class OOPS4 {
	public static void main(String[] args) {
		Payment p=new Payment();
		p.display();
	}
}
