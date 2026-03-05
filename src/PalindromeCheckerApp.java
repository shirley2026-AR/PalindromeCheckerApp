/**
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This program checks whether a string is a palindrome
 * by reversing the string using a loop and comparing it
 * with the original string.
 *
 * Key Concepts:
 * - For Loop
 * - String Immutability
 * - String Concatenation
 * - equals() method
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Print original string
        System.out.println("Input text: " + input);

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }
    }
}