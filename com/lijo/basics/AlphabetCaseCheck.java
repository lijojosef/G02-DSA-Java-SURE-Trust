package com.lijo.basics;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        // PS: take input from usr and check whether it is an uppercase or lowercase

        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        if(ch > 'a' && ch < 'z'){
            System.out.println("Lowercase letter");
        }else{
            System.out.println("Uppercase letter");
        }

    }
}
