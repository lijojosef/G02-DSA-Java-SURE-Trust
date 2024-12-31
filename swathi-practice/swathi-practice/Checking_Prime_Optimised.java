import java.util.*;
public class Checking_Prime_Optimised 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        Check_Prime(n);
    }    
    static void Check_Prime(int n)
    {
        int flag=0;
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else
        {
            System.out.println(n+" is a prime number ");
        }
    }
    
}
