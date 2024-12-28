import java.util.*;
class prctice
{
   /* public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        int num=0;
        while(n>0)
        {
            int r=n%10;
            num=num*10+r;
            n=n/10;
        }
        System.out.println(num);
    }*/

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int day=sc.nextInt();
       /*  switch(day)
        {
            case 1:
            {
                System.out.println("MONDAY");
                break;
            }
            case 2:
            {
                System.out.println("TUESDAY");
                break;
            }
            case 3:
            {
                System.out.println("WEDNESDAY");
                break;
            }
            case 4:
            {
                System.out.println("THURSDAY");
                break;
            }
            case 5:
            {
                System.out.println("FRIDAY");
                break;
            }
            case 6:
            {
                System.out.println("SATURDAY");
                break;
            }
            case 7:
            {
                System.out.println("SUNDAY");
                break;
            }
            default:
            {
                System.out.println("ENTER THE VALID DAY");
            }
        }
    } */
   switch(day)
   {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("WORKING DAYS");
            break;
        case 6:
        case 7:
            System.out.println("HOLIDAY");       
        }
        System.out.println("hlo"); //out from the loop after break statement
    }
}        
