/*
Restaurant Order System
Create a base class MenuItem with name and price. Derive FoodItem and DrinkItem with
overridden prepare() methods.
Sample Output:
Food: Pizza - Preparing dough, adding toppings, baking.
Drink: Coffee - Brewing coffee, adding milk and sugar.
 */

package day7;

class MenuItem {
	String name;
	int price;
	MenuItem(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void prepare() {
		
	}
}

class FoodItem extends MenuItem {
	FoodItem(String name,int price) {
		super(name,price);
	}
	@Override
	public void prepare() {
		System.out.println("Food: "+name+" - Preparing dough, adding toppings, baking.");
	}
}

class DrinkItem extends MenuItem {
	DrinkItem(String name,int price) {
		super(name,price);
	}
	@Override
	public void prepare() {
		System.out.println("Drink: "+name+" - Brewing coffee, adding milk and sugar.");
	}
}

public class OOPS10 {
	public static void main(String[] args) {
		FoodItem fi=new FoodItem("Pizza",200);
		DrinkItem di=new DrinkItem("Coffee",20);
		fi.prepare();
		di.prepare();
	}
}
