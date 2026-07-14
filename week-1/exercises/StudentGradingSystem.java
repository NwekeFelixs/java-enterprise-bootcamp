// EXERCISE 2
import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = input.nextLine(); 
        System.out.print("Enter student score: ");
        int score = input.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Invalid score.");
            input.close();
            return;
        }
        String grade;
        String status;
        if (score >= 70 && score <= 100) {
            grade = "A";
            status = "Excellent";
        } else if (score >= 60 && score <= 69) {
            grade = "B";
            status = "Good";
        } else if (score >= 50 && score <= 59) {
            grade = "C";
            status = "Average";
        } else if (score >= 45 && score <= 49) {
            grade = "D";
            status = "Below Average";
        } else {
            grade = "F";
            status = "Fail";
        }
        System.out.println("Student Name: " + name);
        System.out.println("Student Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
    }
}
