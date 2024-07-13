import java.util.Scanner;

/**
 * ParseInts.java
 * Reads a line of text and prints the sum of the integers in the line.
 */
public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;

        // Initialize the Scanner object for user input using try-with-resources
        try (Scanner scan = new Scanner(System.in)) {

            // Prompt the user to enter a line of text
            System.out.println("Enter a line of text");
            try (Scanner scanLine = new Scanner(scan.nextLine())) {

                // Process each token in the input line
                while (scanLine.hasNext()) {
                    String token = scanLine.next();  // Get the next token
                    try {
                        // Attempt to parse the token as an integer
                        val = Integer.parseInt(token);
                        // Add the parsed integer to the sum
                        sum += val;
                    } catch (NumberFormatException e) {
                        // Print a message for the non-integer token
                        System.out.println("Not an integer: " + token);
                    }
                }
            }
        }

        // Print the sum of integers
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
