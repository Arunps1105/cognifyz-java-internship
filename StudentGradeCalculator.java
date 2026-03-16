import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = (double) total / n;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if(average >= 90)
            System.out.println("Grade: A");
        else if(average >= 75)
            System.out.println("Grade: B");
        else if(average >= 60)
            System.out.println("Grade: C");
        else if(average >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");

        sc.close();
    }
}