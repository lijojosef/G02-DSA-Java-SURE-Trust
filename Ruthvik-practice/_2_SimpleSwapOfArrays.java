import java.util.*;
public class _2_SimpleSwapOfArrays {
    private static int[] SwapValueAtSpecifiedIndex(int[] arr, int a, int b){
        if(a == b){
            return arr;
        }
        if(a > arr.length-1 || b > arr.length-1){
            return arr;
        }
        for(int z = 0; z < arr.length; z++){
            if(z == a){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sai = new Scanner(System.in);
        int n = sai.nextInt();
        int[] arr = new int[n];
        for(int z = 0; z < n; z++){
            arr[z] = sai.nextInt();
        }
        int indexOne = sai.nextInt();
        int indexTwo = sai.nextInt();
        SwapValueAtSpecifiedIndex(arr, indexOne, indexTwo);
        System.out.println(Arrays.toString(arr));
        sai.close();
    }
}
