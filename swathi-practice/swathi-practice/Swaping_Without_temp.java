import java.util.Scanner;
import java.util.*;
public class Swaping_Without_temp 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS TO PERFORM SWAPING");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Swap(a,b);
    }
    static void Swap(int a,int b)
    {
        System.out.println("BEFORE SWAPING  a="+a+"  b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("AFTER SWAPING  a="+a+"  b="+b);
    }
    
}
