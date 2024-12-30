import java.util.Scanner;

public class MiniCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number:");
            double a = sc.nextDouble();
            System.out.print("Enter second number:");
            double b = sc.nextDouble();
            System.out.print("Enter operator (+, -, *, /):");
            String operator = sc.next();

            switch (operator) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("division by zero is infinity ");
                        continue;
                    }
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("try again with valid input ");
                    continue;
            }

            System.out.println(" type 'x' to exit the mini calc");
            String exit = sc.next();
            if (exit.equalsIgnoreCase("x")) {
                System.out.println("exiting ..! \n the mini calc terminated successfully");
                break;
            }
        }
        }

    }
