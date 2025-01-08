package com.lijo.basics.functions;

public class SwapNumbers {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        // swap;
//        swap(a, b);

//        System.out.println("a:"+ a + " " + "b:"+ b);

        String name1 = "Lijo";
        String name2 = "Max";
        swap(name1, name2);

        System.out.println(name1 + " " + name2);
    }

    static void swap(String name1, String name2){
//        int temp = num1;
//        num1= num2;
//        num2 = temp;
//
//        System.out.println("num1:" + num1 + " num2:" + num2);
        String tempName = name1;
        name1 = name2;
        name2 = tempName;


    }


}
