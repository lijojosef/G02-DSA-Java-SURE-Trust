package Tharani_Dharan.LeetCode;

import java.util.HashMap;

//leetcode 1
public class TwoSUm {
    public  static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                arr[0] = i;
                arr[1] = map.get(diff);
                return arr;
            }
            map.put(nums[i] , i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(arr,target);
        System.out.println("Output of TwoSum is : ["+output[0]+","+output[1]+"]");

    }

}
