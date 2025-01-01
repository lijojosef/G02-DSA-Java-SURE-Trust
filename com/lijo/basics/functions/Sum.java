package com.lijo.basics.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        PS: sum of 2 numbers

//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println(sum);

        sum();
        // 2
        sum();
        // 3
        sum();
        sum();
        sum();
        sum();
        sum();


    }

    /*
    return_type FuncitonName{
        //body for the function
        return statement;
    }
     */

    static void sum(){

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        dummy();
        int sum = num1 + num2;
        System.out.println(sum);

    }

    private static void dummy() {
    }

}
