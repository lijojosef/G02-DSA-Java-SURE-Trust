package Tharani_Dharan.Workout;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int value1 = sc.nextInt();

        System.out.print("Enter one of these(+ - * /) :");
        char symbol = sc.next().charAt(0);

        System.out.print("Enter a number:");
        int value2 = sc.nextInt();

        int result = 0;
        switch (symbol){
            case '+':
               result = value1+value2;
               break;
            case '-':
                result = value1-value2;
                break;
            case '*':
                result = value1*value2;
                break;
            case '/':
                if(value2==0){
                    System.out.println("Value2 should not be 0 and should be greater than 0");
                    return;
                }
                result = value1/value2;
                break;
            default:
                System.out.println("Enter a correct symbol");
        }

        System.out.println("Your value is : "+result);
    }
}
