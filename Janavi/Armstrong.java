import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();


        int org;
        org=n;

        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }

        if(org==sum){
            System.out.println("It is armstrong number");
        }
        else{
            System.out.println("It is not armstrong number");
        }
    }
}
