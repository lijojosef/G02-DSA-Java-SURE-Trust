import java.util.*;
public class Amstrong_Or_Not {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        Amstrong(n);
    }
    static void Amstrong(int n)
    {
        int temp=n;
        int temp2=n;
        int l=0;
        while(n>0)
        {
            l++;
            n=n/10;
        }
        int v=0;
        while(temp>0)
        {
            int r=temp%10;
            int d=1;
            int t=l;
            while(t>0)
            {
                d=d*r;
                t--;
            }
            v=v+d;
            temp=temp/10;
        }
        if(temp2==v)
        {
            System.out.println("amstrong");
        }
        else
        {
            System.out.println("NOT amstrong");
        }
    }
}
