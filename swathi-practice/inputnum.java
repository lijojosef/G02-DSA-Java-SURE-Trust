import java.util.*;
public class inputnum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 'X' to stop");
        while(true)
        {
            String n=sc.next();
            if(n.equalsIgnoreCase("x"))
            {
                System.out.println("EXITING THE PROGRAM ");
                break;
            }
            try
            {
                int number=Integer.parseInt(n);
                System.out.println("You entered number is : "+number);
            }
            catch(NumberFormatException e)
            {
                System.out.println("INVALID INPUT PLEASE ENTER AN INTEGER OR 'X' TO EXIST");
            }
            
        }
    }
}