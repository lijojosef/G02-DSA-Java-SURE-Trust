package com.lijo.basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // display characteristics of a fruit

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        /*if (fruit.equals("Mango")) {
            System.out.println("Best fruit");
        }
        if (fruit.equals("Orange")) {
            System.out.println("Bitter fruit");
        }
        if (fruit.equals("Grape")) {
            System.out.println("Small fruit");
        }*/

        /*
        Syntax:
        switch(expression){
            case one:
                // do something
                break;
            case two:
                // do something
                break;

                .
                .
                .
            default:
                // do something
        }
         */

        switch (fruit) {
            case "Mango":
                System.out.println("Best fruit");
                break;
            case "Orange":
                System.out.println("Bitter fruit");
                break;
            case "Grape":
                System.out.println("Bitter fruit");
                break;
            default:
                System.out.println("Enter the correct fruit name");
                break;
        }

        switch (fruit) {
            case "Mango" -> System.out.println("Best fruit");
            case "Orange" -> System.out.println("Bitter fruit");
            case "Grape" -> System.out.println("Small fruit");
            default -> System.out.println("Enter the correct fruit name");
        }
    }
}
