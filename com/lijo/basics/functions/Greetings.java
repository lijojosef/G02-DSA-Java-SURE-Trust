package com.lijo.basics.functions;

public class Greetings {
    public static void main(String[] args) {
        greeting();

        String newGreeting = greeting();

        System.out.println(newGreeting);
    }

    static String greeting() {

        System.out.println("How are you!");
        return "Hello all";

    }
}
