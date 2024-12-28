import java.util.Scanner;

public class ConInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter numbers to process. Enter 'X' to exit.");

        while (true) {
            System.out.print("\nEnter a number (or 'X' to quit): ");
            input = scanner.next();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("X")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            try {
                // Convert input to an integer
                int number = Integer.parseInt(input);

                // Print a simple message
                System.out.println("You entered the number: " + number);
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Invalid input! Please enter a valid number or 'X' to exit.");
            }
        }

        scanner.close(); // Close the Scanner
    }
}
