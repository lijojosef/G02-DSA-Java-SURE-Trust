package Tharani_Dharan.Workout;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num = sc.nextInt();

        int previous = 0;
        int next = 1;
        int count = 2;
        int temp = 0;

        if(num<0){
            System.out.println("Enter a Positive Number");
            return;
        }

        if(num==0){
            System.out.println("Fibonacci value of number "+num+" is : "+previous);
            return;
        }

        if(num==1){
            System.out.println("Fibonacci value of number "+num+" is : "+next);
            return;
        }

        while(count<=num){
            temp = previous+next;
            previous = next;
            next = temp;
            count++;
        }
        System.out.println("Fibonacci value of number "+num+" is : "+temp);
    }
}
