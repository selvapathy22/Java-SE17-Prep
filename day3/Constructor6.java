/*
Employee Salary Management
Question:
Create an Employee class with fields name, basic pay, and department. Use constructor to
initialize and a method to calculate gross salary using looping for allowances. Include condition
for different departments.
Expected Output:
Employee: Kiran
Department: IT
Gross Salary: 62000
Or
Library Book Management
Question:
Design a Book class with overloaded constructors to handle book entries with and without
author name. Include a method to check if a book is overdue based on days borrowed. Use
constructor and method with conditional logic.
Expected Output:
Book: Java Programming Author: Unknown Overdue: Yes
 */

package day3;
import java.util.Scanner;
public class Constructor6 {
	String title, author;
	int daysBorrowed;

	public Constructor6(String title, String author, int days) {
		this.title = title;
		this.author = author;
		this.daysBorrowed = days;
		checkOverdue();
	}
	public Constructor6(String title, int days) {
		this(title, "Unknown", days);
	}
	public void checkOverdue() {
		System.out.println("Book: " + title);
		System.out.println("Author: " + author);
		if(daysBorrowed > 14) {
			System.out.println("Overdue: Yes");
		} else {
			System.out.println("Overdue: No");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		System.out.print("Enter days borrowed: ");
		int days = sc.nextInt();
		sc.nextLine(); // clear buffer
		System.out.print("Enter author (leave empty if unknown): ");
		String author = sc.nextLine();
		if(author.isEmpty()) {
			new Constructor6(title, days);
		} else {
			new Constructor6(title, author, days);
		}
		sc.close();
	}
}
