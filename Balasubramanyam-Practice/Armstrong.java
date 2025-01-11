public class Armstrong {
    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int lnt = 3;
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, lnt);
            num /= 10;
        }
        return sum == temp;
    }
    public static void main(String[] args) {
        for (int num = 100; num <= 999; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }
}
