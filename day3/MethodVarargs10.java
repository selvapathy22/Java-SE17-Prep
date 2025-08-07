/*
Count Words in Sentences
Write a method that accepts varargs of strings and counts total words in all strings.
Sample Input:
countWords("Hello world", "Java programming", "OpenAI")
Expected Output:
5
 */

package day3;

public class MethodVarargs10 {
	public void countWords(String...strings) {
		int count=0;
		for(String s:strings) {
			String[] temp=s.split(" ");
			count+=temp.length;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		MethodVarargs10 tem=new MethodVarargs10();
		tem.countWords("Hello world","Java programming","OpenAI");
	}
}
