package com.Tharani_Dharan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int temp = 0;
        while(count<=num){
            temp = a+b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println("Fibonacci value of number "+num+" is : "+temp);
    }
}
