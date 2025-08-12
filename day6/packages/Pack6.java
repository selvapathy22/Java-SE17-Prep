/*
Array of Objects – Customer Search
Question:
Create a package customer with class Customer having fields: id, name, city. Store customer
objects in an array and search for a customer by city name.
Expected Output:
Search for City: Chennai
Found: ID: 105, Name: Meena, City: Chennai
 */

package packages;
import customer.Customer;
public class Pack6 {
	public static void main(String[] args) {
		Customer[] cs=new Customer[5];
		cs[0]=new Customer(101, "Raana", "Palani");
		cs[1]=new Customer(102, "Mohini", "Dindigul");
		cs[2]=new Customer(103, "Rohini", "Poori");
		cs[3]=new Customer(104, "Kaamini", "Bruh");
		cs[4]=new Customer(105, "Meena", "Chennai");
		System.out.println("Search for City: Chennai");
		for(int i=0;i<5;i++) {
			if(cs[i].isCity(cs[i].city)) {
				System.out.println("Found: ID: "+cs[i].id+", Name: "+cs[i].name+", City: "+cs[i].city);
			}
		}
	}
}
