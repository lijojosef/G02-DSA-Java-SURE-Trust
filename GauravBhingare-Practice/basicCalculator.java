import java.util.Scanner;

public class basicCalculator {
    public static int Ans(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operator");
        String opt = String.valueOf(sc.next().charAt(0));
        int ans=0;
        switch (opt) {
            case "+":
                ans = a + b;
                break;
            case "-":
                ans = a - b;
                break;
            case "*":
                ans = a * b;
                break;
            case "/":
                if(b==0){
                    System.out.println("Cannot divide by 0");
                }else{
                    ans = a / b;
                }
                break;
            default:
                System.out.println("Stopped");
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Result=Ans(a,b);
    }
}
