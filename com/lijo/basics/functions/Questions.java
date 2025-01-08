package com.lijo.basics.functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        // PS: check whether a number is prime Number or not:
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//        System.out.println(isPrime(num));

        // PS: Check whether a number is Armstrong number
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isArmstring(num));

    }

    static boolean isArmstring(int num) {
        int orginal = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }
        return orginal == sum; //true , false
    }

    static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }

        int c = 2;
        while(c*c < num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }




}
