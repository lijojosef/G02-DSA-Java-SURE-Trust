package SriThraylokya_SRC;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number :  ");
        int n= sc.nextInt();
        //153-->1*3 + 5*3 +3*3 =153
        int sum=0,rem=0,num=n;
        while(num>0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        System.out.print("sum is : "+sum+" so, ");
        if(n == sum ){
            System.out.print( n +" is an ArmStrong number ");
        }else {
            System.out.print(n+" is not an Armstrong number ");
        }



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
   }

}
