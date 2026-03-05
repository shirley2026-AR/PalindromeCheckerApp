import java.util.Stack;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * =================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * =================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation
 * using both Queue (FIFO) and Stack (LIFO).
 *
 * At this stage, the application:
 * - Enqueues characters into a Queue
 * - Pushes characters into a Stack
 * - Compares dequeue vs pop values
 * - Displays the result
 *
 * Data Structures: Queue, Stack
 *
 * @author Developer
 * @version 6.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "civic";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push and Enqueue characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        // Compare pop (stack) and dequeue (queue)
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}