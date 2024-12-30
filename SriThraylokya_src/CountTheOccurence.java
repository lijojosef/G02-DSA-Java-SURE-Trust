
public class CountTheOccurence {
    public static void main(String[] args) {
        int n= 15488963;
        int c=0;
        while(n>0) {
            int d = n % 10;
            if (d == 8) {
                c++;
            }
            n=n/10;

        }
        System.out.print(" "+c);
    }
}
