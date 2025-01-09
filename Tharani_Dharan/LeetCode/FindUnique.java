package Tharani_Dharan.LeetCode;

public class FindUnique {

    public static int findUnique(int[] arr){

        int unique = 0;
        for(int i=0;i< arr.length;i++){
            unique^=arr[i];
        }
        return unique;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,6,3,6,2};
        int unique = findUnique(arr);
        System.out.println("Unique element is :"+unique);
    }
}
