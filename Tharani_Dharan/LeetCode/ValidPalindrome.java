package Tharani_Dharan.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static boolean isPalindrome1(String s) {
        String[] arr = s.split("[^a-zA-Z0-9+]");

        String x=String.join("",arr).toLowerCase();
        StringBuilder a = new StringBuilder(x);
        if(x.equals(a.reverse().toString())){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String s) {
        int start = 0;
        int end = s.length()-1;

        char charFromStart = s.charAt(start);
        char charFromEnd = s.charAt(end);

       while(start<end){
           while(!((charFromStart>= 'a' && charFromStart <= 'z') || (charFromStart>= 'A' && charFromStart <= 'Z') || (charFromStart>= '0' && charFromStart <= '9'))){
               start++;
               if(start>end){
                   return true;
               }
               charFromStart = s.charAt(start);
           }

           while(!((charFromEnd>= 'a' && charFromEnd <= 'z') || (charFromEnd>= 'A' && charFromEnd <= 'Z') || (charFromEnd>= '0' && charFromEnd <= '9'))){
               end--;
               if(start>end){
                   return true;
               }
               charFromEnd = s.charAt(end);
           }
           if(Character.toLowerCase(charFromStart) != Character.toLowerCase(charFromEnd)){
               return false;
           }

           start++;
           end--;
       }
       return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("The given String checked using Method 1 is : "+ (isPalindrome1(input) ? "Palindrome" : "NotPalindrome"));
        System.out.println("The given String checked using Method 2 is : "+ (isPalindrome2(input) ? "Palindrome" : "NotPalindrome"));


    }

}
