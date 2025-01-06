package com.lijo.basics.arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        // initialization :
        // data_type[] name = new data_type[];
//        int[] rno = new int[5];
//
//        rno[2] = 5;
//
//
//        int[] rnos = {2, 34, 56, 8, 9};
//
//        // display:
//        for (int i = 0; i < 5; i++){
//            System.out.print(rnos[i]+" ");
//        }
//        System.out.println();
//
//        //enhanced for loops:
//        for(int num: rnos){
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//
//
//        //using Arrays library
//        System.out.println(Arrays.toString(rnos));

        //multidimensional array:
//        int[][] arr = new int[3][];

        //
//        int[][] arr1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {8, 9, 10}
//        };

        //1)how to take input in an array
        //2)how to take input and output in a multidimensional array from a user

        int[] arr = {1, 3, 23, 9, 18};
        swap(arr, 1, 3);
        
        
        reverse(arr);
    }

    private static void reverse(int[] arr) {

    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
