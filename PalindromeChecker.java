import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}