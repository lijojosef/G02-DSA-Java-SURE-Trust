import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simple Calculator");
        while (true) {
            System.out.println("Enter the operation you want to perform: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n x . Exit");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("X")) {
                System.out.println("Exiting....... !");
                break;
            }
            System.out.println("Enter the two numbers for the claculation :");


            int number1 = in.nextInt();
            int number2 = in.nextInt();  
            in.nextLine();
            int result=0;
            switch (input) {
                case "1" -> result = number1 + number2;
                case "2" -> result = number1 - number2;
                case "3" -> result = number1 * number2;
                case "4" -> {
                    if (number2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                    result = number1 / number2;
                }
                default -> System.out.println("Invalid operator.");
            }
            System.out.println("Result: " + result);
            
        }
    }
}
