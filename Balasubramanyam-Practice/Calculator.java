import java.util.Scanner;

public class Calculator {
    public static void calci(String choice,double num1,double num2){
        switch (choice) {
            case "+" ->  System.out.println("Result: " + (num1 + num2));
                

            case "-" -> System.out.println("Result: " + (num1 - num2));
                

            case "*" -> System.out.println("Result: " +( num1 * num2));

            case "/" -> { 
                if (num2 != 0) {

                    System.out.println("Result: " +(num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            }
            default -> System.out.println("please try again.");
        }

    }

    public static void main(String[] args) {
        Scanner balu = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("+. Add");
            System.out.println("-. Subtract");
            System.out.println("*. Multiply");
            System.out.println("/. Divide");
            System.out.println("x. Exit");

            String choice = balu.next();
            if (choice == "X"|| choice =="x") {
                System.out.println("Exit the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = balu.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = balu.nextDouble();
            calci(choice,num1,num2);
        }
        balu.close();
    }
}
