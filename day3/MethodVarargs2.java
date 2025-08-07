/*
Print All Names
Write a method to print all names passed using String... varargs.
Sample Input:
printNames("Alice", "Bob", "Charlie")
Expected Output:
Alice
Bob
Charlie
 */

package day3;

public class MethodVarargs2 {
	public void printNames(String... str) {
		for(String s:str) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		MethodVarargs2 tem=new MethodVarargs2();
		tem.printNames("Alice","Bob","Charlie");
	}
}
