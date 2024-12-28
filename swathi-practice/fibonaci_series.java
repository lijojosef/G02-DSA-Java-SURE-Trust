import java.util.*;
class fibinoci_series
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,s=1,nth=0;
        int count=0;
        while(count<n)
        {
            System.out.print(f + " ");
            nth=f+s;
            f=s;
            s=nth;
            count++;
        }
    }
}