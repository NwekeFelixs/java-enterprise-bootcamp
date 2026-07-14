import java.util.Scanner;

public class LoanEligiblityChecker {
    public static void main (String [] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Your Age: ");
        int age = input.nextInt();
        if (age < 0) {
            System.out.println("Invalid Age");
            input.close();
            return;
        }

        System.out.print("Your Monthly Salary: ");
        double monthlySalary = input.nextDouble();
        if (monthlySalary < 0) {
            System.out.println("Not A Valid Salary");
            input.close();
            return;
        }

        System.out.print("Years AT Job: ");
        int yearsAtJob = input.nextInt();
        if (yearsAtJob < 0) {
            System.out.println("Years at Job Cannot be a negative number");
            input.close();
            return;
        }

        String status;

        if (yearsAtJob >= 2 && monthlySalary >= 150000 && age >= 21) {
            status = "Eligible";
        } else {
            status = "Not eligible";
            System.out.println("Reasons: Applicant Must be atleast 21 years old");
            System.out.println("Reasons: Applicant Must have been at his job over at least 2 years");
            System.out.println("Reasons: Applicant's Salary should be greater than or equal to 150,000");

        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary " + monthlySalary);
        System.out.println("Years At Job: " + yearsAtJob);
        System.out.println("Loan status: " + status);

        input.close();
    }

}
