import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double num1, num2, result;
        char operator;

        System.out.println("Welcome to the Calculator! Press 'x' or 'X' to exit.");

        while (true) {
            System.out.print("Enter first number: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("x"))
            {
                 break;
            }     
            num1 = Double.parseDouble(input);

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.nextLine().charAt(0);

            System.out.print("Enter second number: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("x"))
            {
                 break;
            }    
            num2 = Double.parseDouble(input);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
            }
        }
        scanner.close();
        System.out.println("Calculator closed.");
    }
}
