import java.util.Scanner;
public class CharCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: A character from the user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is uppercase or lowercase
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not a letter.");
        }

        scanner.close(); // Close the Scanner
    }
}

    
