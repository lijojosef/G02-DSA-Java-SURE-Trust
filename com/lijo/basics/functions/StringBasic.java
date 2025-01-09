package com.lijo.basics.functions;

public class StringBasic {
    public static void main(String[] args) {
        // "Lijo Joseph"
        // using literals
        String name = "Lijo";

        String newName = "Lijo";

        // using new keyword
        String name2 = new String("Joseph");

        name.length(); // find out the length of the string value

        //concat
        String fullName = name + " " + name2;
        System.out.println(fullName);

        //character at an index
        name.charAt(3);

        //substring
        name.substring(6, 11);

        //comparison
//        boolean isNameSame = name.equals(name2); // true or false
//        name.equalsIgnoreCase(name2);

//        str.toLowerCase();
//        str.toUpperCase();

        String str = "      Max    ";
        str.trim();

        //split(), replace(), ...

        String reversed = "";
        // Reverse a string:
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        //x + a = xa, xa + M => xaM

        StringBuilder sb = new StringBuilder(str);
        String newReversedValue = sb.reverse().toString();

        // Q1: Count occurence of a character in a string
        // Q2: Check if a string is a palindrome or not

    }
}
