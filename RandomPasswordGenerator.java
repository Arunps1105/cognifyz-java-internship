import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}