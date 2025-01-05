package SriThraylokya_SRC;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number :  ");
        int n= sc.nextInt();
        //153-->1*3 + 5*3 +3*3 =153
        int sum=0,rem=0;
        while(n>0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        System.out.println(sum);
        if(n == sum ){
            System.out.println( n +" is an ArmStrong number ");
        }

    }

}
