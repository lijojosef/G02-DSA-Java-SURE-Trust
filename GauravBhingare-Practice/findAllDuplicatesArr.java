import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findAllDuplicatesArr {
    public static List<Integer> findDuplicates(int[] nums) {
        int temp=0;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                temp = map.get(nums[i]);
                map.put(nums[i], temp + 1);
            }
            else {
                map.put(nums[i], 1);
            }
            if(map.get(nums[i])==2) {
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        findDuplicates(nums);
    }
}
