import java.io.*;
import java.util.Scanner;

public class FileEncryptionDecryption {

    public static void encryptFile(String inputFile, String outputFile, int key) throws IOException {
        FileReader fr = new FileReader(inputFile);
        FileWriter fw = new FileWriter(outputFile);

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch + key);
        }

        fr.close();
        fw.close();
        System.out.println("File encrypted successfully!");
    }

    public static void decryptFile(String inputFile, String outputFile, int key) throws IOException {
        FileReader fr = new FileReader(inputFile);
        FileWriter fw = new FileWriter(outputFile);

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch - key);
        }

        fr.close();
        fw.close();
        System.out.println("File decrypted successfully!");
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encrypt File");
        System.out.println("2. Decrypt File");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter input file name: ");
        String input = sc.nextLine();

        System.out.print("Enter output file name: ");
        String output = sc.nextLine();

        System.out.print("Enter key number: ");
        int key = sc.nextInt();

        if (choice == 1) {
            encryptFile(input, output, key);
        } else if (choice == 2) {
            decryptFile(input, output, key);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}