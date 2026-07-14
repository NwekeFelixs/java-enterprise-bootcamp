
import java.util.Scanner;


public class BankDepositSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String customerName = input.nextLine();
        System.out.print("What is your Old Balance: ");
        double oldBalance = input.nextDouble();
        if (oldBalance < 0) {
            System.out.println("Your Balance Cannot be less than 0");
            input.close();
            return;
        }

        String bonusInterest = "No";
        
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();
        if ( depositAmount < 0) {
            System.out.println("Deposit amount cannot be negative ");
            input.close();
            return;
        } else if (depositAmount >= 100000) {
            System.out.println("Congratulations! You earned bonus interest.");
            bonusInterest = "Yes";
        }

       double balance = oldBalance + depositAmount;
       String customerCategory = "";

       if (balance <= 100000) {
            customerCategory = "Regular";
       } else if (balance >= 100000 && balance < 500000 ) {
            customerCategory = "Gold";
       } else if ( balance > 500000) {
            customerCategory = "VIP";
       }

       System.out.println("================================");
       System.out.println("      Deposit Receipt      ");
       System.out.println("==================================");
       System.out.println("Name: " + customerName);
       System.out.println("Old Balance: " + oldBalance);
       System.out.println("Deposited: " + depositAmount);
       System.out.println("New Balance: " + balance);
       System.out.println("Category: " + customerCategory);
       System.out.println("Bonus Interest: " + bonusInterest);
       System.out.println("====================================");

       input.close();
    }
}
