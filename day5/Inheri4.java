/*
E-Commerce System: Platform → Order → Payment
Concept: Demonstrate multilevel inheritance and overriding in an online order-payment flow.
Classes:
• Platform → shows site info
• Order → takes product & amount
• Payment → confirms payment with override
Sample Output:
• Platform: ShopEasy
• Order Created: Wireless Mouse
• Amount: ₹799.0
• Payment Done via UPI for ₹799.0
 */

package day5;
class Platform {
	void displayInfo() {
		System.out.println("Platform: ShopEasy");
	}
}
class Order extends Platform {
	@Override
	void displayInfo() {
		System.out.println("Order Created: Wireless Mouse");
		System.out.println("Amount: $799.0");
	}
}
class Payment extends Order {
	@Override
	void displayInfo() {
		System.out.println("Payment done via UPI for $799.0");
	}
}
public class Inheri4 {
	public static void main(String[] args) {
		Platform pl=new Platform();
		Order or=new Order();
		Payment pay=new Payment();
		pl.displayInfo();
		or.displayInfo();
		pay.displayInfo();
	}
}
