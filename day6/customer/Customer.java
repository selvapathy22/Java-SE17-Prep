/*
Array of Objects – Customer Search
Question:
Create a package customer with class Customer having fields: id, name, city. Store customer
objects in an array and search for a customer by city name.
Expected Output:
Search for City: Chennai
Found: ID: 105, Name: Meena, City: Chennai
 */

package customer;

public class Customer {
	public String name,city;
	public int id;
	public Customer(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public boolean isCity(String srchcity) {
		if(srchcity.equals("Chennai")) {
			return true;
		} else {
			return false;
		}
	}
}
