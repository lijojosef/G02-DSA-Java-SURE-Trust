

public class Reverse {
    public static void main(String[] args) {
        int n = 15496;
        int rev=0, rem=0;
        //int c=0;
        while(n>0){
             rem =n%10 ;
             rev= (rev *10)+ rem ;
             n=n/10 ;

        }
        System.out.println(rev);
    }
}
