import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("enter number 1: ");
        int num2=sc.nextInt();
        System.out.println("enter the operator to perform operation : ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
            System.out.println(num1+num2);
            break;
            case '-':
            System.out.println(num1-num2);
            break;
            case '*':
            System.out.println(num1*num2);
            break;
            case '/':
            if(num2==0) System.out.println("please enter the denominator as non zero value");
            else System.out.println(num1/num2);
            break;
            case '%':
            System.out.println(num1%num2);
            break;
            default:
            System.out.println("Ivalid expression");

        }
    }

}
