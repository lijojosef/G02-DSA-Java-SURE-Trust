package com.lijo.basics;

public class Largest {
    public static void main(String[] args) {
        //ps : find out the largest among 3 integers
        int num1 = 3456;
        int num2 = 44;
        int num3 = 889;

//        int max = num1;
//        if(num2 > max){
//            max = num2;
//        }
//        if(num3 > max){
//            max = num3;
//        }

        int max = Math.max(num3, Math.max(num1, num2));

        System.out.println(max);
    }
}
