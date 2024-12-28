import java.util.*;
import java.util.Scanner;
class conditionalstatements
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>50)
        {
            System.out.println("U are old");
        }
        else
        {
            System.out.println("U r young");
        }
    }
}

