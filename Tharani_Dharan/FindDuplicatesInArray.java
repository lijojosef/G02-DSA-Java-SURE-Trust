package Tharani_Dharan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//leetcode 443
public class FindDuplicatesInArray {

    //Using HashMap and ArrayList
    public static List<Integer> findDuplicates1(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                list.add(entry.getKey());
            }
        }
        return list;

    }

    //Using Array and ArrayList
    public static List<Integer> findDuplicates2(int[] nums) {

        int[] arr = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            arr[nums[i]]++;
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                list.add(i);
            }
        }
        return list;


    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List resultBy1 = findDuplicates1(arr);
        List resultBy2 = findDuplicates2(arr);

        System.out.println("Result using method1 : "+resultBy1);
        System.out.println("Result using method2 : "+resultBy2);

    }
}
