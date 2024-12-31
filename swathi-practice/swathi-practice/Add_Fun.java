import java.util.*;
public class Add_Fun
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS TO PERFORM ADDITION");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Add(a,b);
    }
    static void Add(int a,int b)
    {
        int s=a+b;
        System.out.println("Sum of two numbers is  "+s);
    }

}