import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE X TO EXIST");
        while(true)
        {
            System.out.println("ENTER THE NUMBER");
            String n1=sc.next();
            if(n1.equalsIgnoreCase("x"))
            {
                System.out.println("EXITING FROM THE PROGRAM");
                break;
            }
            try
            {
                float num1=Float.parseFloat(n1);
                float num2=sc.nextFloat();
                System.out.println("ENTER '1' FOR +  ENTER '2' FOR -   ENTER '3' FOR *  ENTER '4' FOR /  ");
                int i=sc.nextInt();
                switch(i)
                {
                    case 1:
                        float sum=num1+num2;
                        System.out.println("ADDITION OF TWO NUMBER IS :"+sum);
                        break;
                    case 2:
                        System.out.println("SUBTRACTION OF TWO NUMBER IS :"+(num1-num2));
                        break;  
                    case 3:
                        System.out.println("MULTIPLICATION OF TWO NUMBER IS :"+num1*num2);
                        break;
                    case 4:
                        System.out.println("DIVISION OF TWO NUMBER IS :"+num1/num2);
                        break;    
                    default:
                        System.out.println("enter  1 to 4");                                   
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("ENTER X TO EXIST");
            }
        }    
        
    }
}
