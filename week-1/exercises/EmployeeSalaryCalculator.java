import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = input.nextLine();
        System.out.print("Hours worked: ");
        int hoursWorked = input.nextInt();
        if (hoursWorked < 0) {
            System.out.println("Invalid hours worked.");
            input.close();
            return;
        }
        System.out.print("Enter hourly rate: ");
        double hourlyRate = input.nextDouble();
        if (hourlyRate < 0) {
            System.out.println("Invalid hourly rate.");
            input.close();
            return;
        }
        double salary = hoursWorked * hourlyRate;
        String category;    
        if (salary >= 10000) {
            category = "High Income Employee";
        } else {
            category = "Regular Income Employee";
        }
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Salary: $" + salary);
        System.out.println("Category: " + category);
        input.close();
    }
}
