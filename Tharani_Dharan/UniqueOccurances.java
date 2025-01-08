package Tharani_Dharan;

import java.util.HashMap;
import java.util.HashSet;

//leetcode 1207
public class UniqueOccurances {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(Integer i : map.values()){
            if(!set.add(i)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        boolean result = uniqueOccurrences(arr);
        System.out.println("The answer is : "+result);
    }
}
