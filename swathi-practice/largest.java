import java.util.*;
public class largest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1=sc.nextInt();
        System.out.println("Enter the number2");
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println(num1+" is greatest");
        }
        else{
            System.out.println(num2+" is greatest");
        }
    }
}