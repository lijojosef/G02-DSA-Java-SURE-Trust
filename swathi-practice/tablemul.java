import java.util.*;
public class tablemul
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE  NUMBER FOR TABLE");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}