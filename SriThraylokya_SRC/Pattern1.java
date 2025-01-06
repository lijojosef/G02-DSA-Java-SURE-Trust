package SriThraylokya_SRC;


public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("..pattern");
        int n=5,k=4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                    System.out.print("#");
            }
            System.out.println(" ");
        }
        patter2(k);
    }


    public static void patter2(int k){
        for (int i = 0; i < k; i++) {
            for (int j = i; j < k+1; j++) {
                System.out.print("$");
            }
            System.out.println(" ");

        }
    }
}



