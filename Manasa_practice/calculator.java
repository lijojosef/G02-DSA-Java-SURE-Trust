import java.util.*;
class calculator{
    public static void main(String[] args)
    {
        Scanner sn=new Scanner(System.in);
        String ch;
        do{
       
        System.out.println("Enter value 1:");
        int m=sn.nextInt();
        System.out.println("Enter value 2:");
        int n=sn.nextInt();
        sn.nextLine();
        System.out.println("enter operations to perform \n add for addition \n sub for subtraction \n mul for multiplication \n div for division");
        String val=sn.nextLine();
        switch(val)
        {
            case "add":
                 int sum=m+n;
                 System.out.println(sum);
                 break;
            case "sub":
                System.out.println(m-n);
                break;
            case "mul":
                System.out.println(m*n);
                break;
            case "div":
                System.out.println(m/n);
                break;
            default:
                System.out.println("Enter specified value");
                

        }
        System.out.println("Do you want to continue? Enter 'X' or 'x' to exit, or any other key to continue:");
        ch=sn.nextLine();
    }
    while(!ch.equalsIgnoreCase("X"));
    sn.close();


    }
}