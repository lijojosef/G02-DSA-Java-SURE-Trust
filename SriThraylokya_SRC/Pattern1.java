package SriThraylokya_SRC;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("..pattern");
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                    System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}

