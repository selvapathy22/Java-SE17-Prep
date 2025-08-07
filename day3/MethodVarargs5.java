/*
Concatenate Strings
Write a method that concatenates all strings passed to it using varargs.
Sample Input:
concat("Hello", " ", "World", "!")
Expected Output:
Hello World!
 */

package day3;

public class MethodVarargs5 {
	public void concat(String...str) {
		StringBuffer strbf = new StringBuffer();
		for(String s:str) {
			strbf.append(s);
		}
		System.out.println(strbf);
	}
	public static void main(String[] args) {
		MethodVarargs5 temp=new MethodVarargs5();
		temp.concat("Hello"," ","World","!");
	}
}
