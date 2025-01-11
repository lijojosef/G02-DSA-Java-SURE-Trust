package com.lijo.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //PS print Hello world 10 times

//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//

        /*
        Syntax:
        for(intialisation; condition; increment/ decrement){
            //body
        }
         */
        // PS print numbers from 1 to 5
        /*for (int num = 1; num <= 5 ; num++) {
            System.out.print(num + " ");
        }*/

        // PS print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = in.nextInt();

//        for (int num = 1; num <= n ; num++) {
//            System.out.print(num + " ");
//        }


        //while loop
        /*
        Syntax:

        while(condition){
            //body
            increment/decrement
        }
         */

//        for (int num = 1; num <= n ; num++) {
//            System.out.print(num + " ");
//        }

        int num = 1;
        while(num <= n){
            System.out.print(num + " ");
            num++;
        }

        /**
         * if you know how many times to loops : for loop
         * if you are not sure on how many times to loop: while loop
         * while loops look beautiful ~optional
         */

        // do while loop
        /*
        Syntax:
        do{
        // body
        }while(condition);
        // if we want to atleast execute one time.
         */

    }
}
