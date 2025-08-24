/*
Library Management System
Create a base class LibraryItem with title and author. Derive Book, Magazine, and DVD with
overridden displayInfo() methods.
Sample Output:
Book: 'Java Programming' by James Gosling
Magazine: 'Tech Today' - Issue: Aug 2025
DVD: 'Inception' - Duration: 148 minutes
 */

package day7;

class LibraryItem {
	String title,author;
	LibraryItem(String title,String author) {
		this.title=title;
		this.author=author;
	}
	public void displayInfo() {

	}
}

class Book extends LibraryItem {
	Book(String title,String author) {
		super(title,author);
	}
	@Override
	public void displayInfo() {
		System.out.println("Book: "+title+" by "+author);
	}
}

class Magazine extends LibraryItem {
	String date;
	Magazine(String title,String date) {
		super(title,date);
	}
	@Override
	public void displayInfo() {
		System.out.println("Magazine: "+title+" - Issue: "+author);
	}
}

class DVD extends LibraryItem {
	DVD(String title,String duration) {
		super(title,duration);
	}
	@Override
	public void displayInfo() {
		System.out.println("DVD: "+title+" - Duration: "+author);
	}
}

public class OOPS7 {
	public static void main(String[] args) {
		Book bk=new Book("'Java Programming'","James Gosling");
		Magazine mg=new Magazine("'Tech Today'","Aug 2025");
		DVD dvd=new DVD("'Inception'","148 minutes");
		bk.displayInfo();
		mg.displayInfo();
		dvd.displayInfo();
	}
}
