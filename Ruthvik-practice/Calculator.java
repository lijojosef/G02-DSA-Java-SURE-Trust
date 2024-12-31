import java.util.*;
public class Calculator{
    private static int calc(char c, int a, int b){
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if(b == 0){
                    System.out.println("Error : Division by zero is not allowed.");
                    return 0;
                }
                return a / b;
            case '%':
                if(b == 0){
                    System.out.println("Error : Modulo by zero is not allowed.");
                    return 0;
                }
                return a % b;
            default:
                System.out.println("Inavlid input try again!");
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sai = new Scanner((System.in));
        System.out.println("Enter two numbers : ");
        int n1 = sai.nextInt();
        int n2 = sai.nextInt();
        System.out.println("Enter the operator for calculation : ");
        sai.nextLine();
        char c = sai.nextLine().charAt(0);
        System.out.println(n1+" "+c+" "+n2+" = "+calc(c,n1,n2));
        sai.close();
    }
}