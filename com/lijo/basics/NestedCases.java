package com.lijo.basics;

import java.util.Scanner;

public class NestedCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
//        String dept = in.next();

//        switch(empID){
//            case 1:
//                System.out.println("Lijo");
//                break;
//            case 2:
//                System.out.println("Max");
//                break;
//            case 3:
//                switch (dept){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    default:
//                        System.out.println("Enter proper dept");
//                }
//            default:
//                System.out.println("Enter proper empID");
//        }


        switch (empID) {
            case 1, 2, 3 -> System.out.println("For case 1, 2, 3 printing this!!");
            case 4 -> System.out.println("Case 4 output");
            default -> System.out.println("Enter proper empID");
        }
    }
}
