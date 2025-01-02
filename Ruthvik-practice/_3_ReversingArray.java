import java.util.*;
public class _3_ReversingArray {
    private static int[] Reverse(int[] arr){
        for(int z = 0,y = arr.length-1; z < arr.length / 2;z++, y--){
            int temp = arr[z];
            arr[z] = arr[y];
            arr[y] = temp;
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
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
        sai.close();
    }
}
