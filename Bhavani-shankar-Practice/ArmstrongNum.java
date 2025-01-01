import java.util.*;
public class ArmstrongNum {
    static boolean isarmstrong(int num){
        int temp = num;
        int answer = 0;
        int nums = String.valueOf(num).length();

        while (temp != 0) {
            int result = temp % 10;
            answer += Math.pow(result, nums);
            temp /= 10;
        }
        return num == answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        boolean res = isarmstrong(num);
        System.out.println(res);
    }
}
