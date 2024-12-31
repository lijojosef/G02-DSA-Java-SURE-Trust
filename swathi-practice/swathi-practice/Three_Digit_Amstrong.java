import java.util.*;
public class Three_Digit_Amstrong
{
    public static void main(String[] args)
    {
        System.out.println("THREE DIGIT AMSTRONG NUMBERS ARE:");
        int l=3;
        int start=100;
        int end=999;
        while(start<=end)
        {
            int i=start,r,v=0;
            while(i>0)
            {
                r=i%10;
                int d=1,t=l;
                while(t>0)
                {
                    d=d*r;
                    t--;
                }
                v=v+d;
                i=i/10;
            }
            if(v==start)
            {
                System.out.print(start+"  ");
            }
            start++;
        }
    }
    
}
