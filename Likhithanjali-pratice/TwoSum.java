import java.util.Scanner;
class Solution {
    static  int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]==target-nums[i])
                {
                    return new int[] {i,j};
                }
            }
        }
         return new int[]{};
    }
   
}
public class TwoSum{
    public static void main(String[] arg)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=a.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            nums[i]=a.nextInt();

        }
        int target=a.nextInt();
        System.out.println("enter the target sum:");
        Solution.twoSum(nums, target); 
    a.close();
    }

}