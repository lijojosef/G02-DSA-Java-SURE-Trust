package com.Sri.code;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int sum=0 ,d;
        while(n!=0){
            d=n%10;
            sum += (int)Math.pow(d,3);
            n=n/10;
        }
        if(sum == n)
            System.out.println(sum +" is an Armstrong number ");
        else
            System.out.println(" "+sum +" is not an armstrong number .");

//        int number = 371, originalNumber, remainder, result = 0;
//
//        originalNumber = number;
//
//        while (originalNumber != 0)
//        {
//            remainder = originalNumber % 10;
//            result += Math.pow(remainder, 3);
//            originalNumber /= 10;
//        }
//
//        if(result == number)
//            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");











//        temp = n;
//        while (temp > 0) {
//            temp = temp / 10;
//            count++;
//        }
//        temp = n;
//        while (n > 0) {
//            d = n % 10;
//            sum += (int) Math.pow(d, count);
//            n = n / 10;
//        }
//        System.out.println(sum);
//       if (n==sum) {
//            System.out.println(" " + sum);
//           System.out.println("an armstrong number");
//        }



    }
}
