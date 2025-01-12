import java.util.Scanner;
public class DigitOccur {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Whole number and the digit to find
        System.out.print("Enter a whole number: ");
        long number = scanner.nextLong();

        System.out.print("Enter the digit to find: ");
        int digit = scanner.nextInt();

        // Initialize count
        int count = 0;
        long temp = Math.abs(number); // Handle negative numbers

        // Count occurrences of the digit
        while (temp > 0) {
            if (temp % 10 == digit) {
                count++;
            }
            temp /= 10;
        }

        // Output the result
        System.out.println("The digit " + digit + " occurs " + count + " times in " + number + ".");

        scanner.close(); // Close the Scanner
    }
}

    
