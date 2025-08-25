/*
Array – Remove an Element (Shift Left)
Question:
Write a program to remove an element at a given index from an array (shift remaining elements left).
Expected Output:
Array: 10 20 30 40 50
Remove index: 2
Result: 10 20 40 50
 */

package day8;
import java.util.*;

public class Coll2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array: ");
        String line = sc.nextLine();              // Read entire line
        String[] parts = line.split(" ");         // Split by spaces
        List<Integer> ls = new ArrayList<>();
        for(String p : parts) {
            ls.add(Integer.parseInt(p));          // Convert to int and add
        }
        System.out.print("Remove index: ");
        int idx = sc.nextInt();
        sc.close();
        if(idx >= 0 && idx < ls.size()) {
            ls.remove(idx);                        // Remove element at index
        }
        System.out.print("Result: ");
        for(int num : ls) {
            System.out.print(num + " ");
        }
    }
}