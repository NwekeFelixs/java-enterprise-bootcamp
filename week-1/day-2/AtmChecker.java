import java.util.Scanner;

public class AtmChecker {
    public static void main(String[] args) {
        System.out.println("=======ATM Checker=======");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your balance: ");
        double balance = input.nextDouble();
        String customerType;
        String status;
        
       if (age < 18 || balance < 5000) {
            status = "Not Eligible";
            customerType = "None";
        } else {
            status = "Eligible";
            if (balance >= 100000) {
                customerType = "VIP";
            } else if (balance >= 50000) {
                customerType = "Gold";
            } else {
                customerType = "Regular";

            }
        }

        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.printf("Balance: ₦%,.2f%n",balance); 
        System.out.println("STATUS: " + status);
        System.out.println("CUSTOMER TYPE: " + customerType);

        System.out.println("=================");
    }
}
