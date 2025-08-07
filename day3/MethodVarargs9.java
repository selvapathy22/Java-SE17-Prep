/*
Check Palindromes
Write a method that checks each string passed and prints whether it is a palindrome.
Sample Input:
checkPalindromes("madam", "racecar", "java")
Expected Output:
madam: Palindrome
racecar: Palindrome
java: Not a Palindrome
 */

package day3;

public class MethodVarargs9 {
	public boolean isPali(String s) {
		String revs="";
		char[] temp=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			revs+=temp[i];
		}
		return s.equals(revs);
	}
	public void checkPalindromes(String... strings) {
		for(String s:strings) {
			if(isPali(s)) {
				System.out.println(s+": Palindrome");
			} else {
				System.out.println(s+": Not a Palindrome");
			}
		}
	}
	public static void main(String[] args) {
		MethodVarargs9 temp=new MethodVarargs9();
		temp.checkPalindromes("madam","racecar","java");
	}
}
