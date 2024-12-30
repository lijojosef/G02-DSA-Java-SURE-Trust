import java.util.*;
public class Check_Upper_Lower
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        System.out.println(c);
        if(c>=65 && c<=90)
        {
            System.out.println(c+" IS UPPER CASE CHARACTER");
        }
        else if(c>=97 && c<=122)
        {
            System.out.println(c+" IS LOWER CASE CHARACTER");
        }
        else
        {
            System.out.println("NOT LOWER AND UPPERCASE CHARACTER");
        }
    }
}
