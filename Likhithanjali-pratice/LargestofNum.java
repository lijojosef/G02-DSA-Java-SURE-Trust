import java.util.Scanner;
public class LargestofNum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input: Two numbers from the user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
    
            // Find the largest number
            if (num1 > num2) {
                System.out.println("The largest number is: " + num1);
            } else if (num2 > num1) {
                System.out.println("The largest number is: " + num2);
            } else {
                System.out.println("Both numbers are equal.");
            }
    
            scanner.close(); // Close the Scanner
        }
    }
    
    
