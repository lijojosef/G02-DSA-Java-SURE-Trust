import java.util.*;
public class Digit_Occurence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the digit");
        int d=sc.nextInt();
        int r,c=0;
        while(num>0)
        {
            r=num%10;
            if(r==d)
            {
                c++;
            }
            num=num/10;    
        }
        System.out.println("THE OCCURRENCE OF "+d+" is "+ c);
        

    }
}