package Tharani_Dharan.LeetCode;

import java.util.Arrays;

//code360
public class Sort0and1 {

    public static void sortZeroesAndOne(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start] == 1){
                //swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            }else{
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {0,1,1,0,1,0,1};
        sortZeroesAndOne(arr);
        System.out.println("After sorting 0 and 1 :"+ Arrays.toString(arr));
    }
}
