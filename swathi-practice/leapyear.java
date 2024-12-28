import java.util.*;
class leapyear
{
    public static void main(String[] args)
    {
        int year;
        Scanner y=new Scanner(System.in);
        System.out.println("ENTER THE YEAR");
        year=y.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("NOT A LEAP YEAR");
        }

    }
}