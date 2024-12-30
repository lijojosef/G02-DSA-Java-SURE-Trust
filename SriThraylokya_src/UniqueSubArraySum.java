import java.util.HashSet;
import java.util.Set;

public class UniqueSubArraySum {

//    sum of unique subarrays .. ex:7,2,3,2,2,-->
//    7 ,2,3,(2+2=4),(2+3=5),(2+7=9),(7+2+3=12),(7+2+3+2=14),(7+3+2+2+2=16)
//    are only 9 unique sums we get by using subarray of int[]a--> so t0 print 9 as the output

    public static int solve(int n, int[] a) {
        Set<Integer> UniqueSums = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += a[k];        //0+7=7 -->7+2=10-> ...!
                }
                UniqueSums.add(sum);
            }
        }
        return UniqueSums.size();  //to return no.of uniq elements found
    }

    public static void main(String[] args) {
        int[] l = {7, 2, 3, 2, 2};
        int n = l.length;
        System.out.println(solve(n, l));
    }


}