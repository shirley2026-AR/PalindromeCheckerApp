import java.util.Deque;
import java.util.LinkedList;

/**
 * =================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * =================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Deque (Double Ended Queue).
 *
 * At this stage, the application:
 * - Inserts characters into a deque
 * - Removes first and last elements
 * - Compares them until deque is empty
 * - Displays the result
 *
 * Data Structure: Deque
 *
 * @author Developer
 * @version 7.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}