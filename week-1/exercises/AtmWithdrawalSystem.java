import java.util.Scanner;

public class AtmWithdrawalSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Balance: ");
        double balance = input.nextDouble();
        if (balance < 0) {
            System.out.println("Balance Cannot Be less than Zero");
            input.close();
            return;
        }
        System.out.print("Withdrawal Amount: ");
        double withdrawalAmount = input.nextDouble();
        if (withdrawalAmount <= 0) {
          System.out.println("Withdrawal Amount Cannot Be less than Zero");  
          input.close();
          return;
        } 

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds.");
            input.close();
            return;
        }

        double currentBalance = balance - withdrawalAmount;

        if (currentBalance < 1000) {
            System.out.println("You must maintain a Minimum Balance of 1000");
            input.close();
            return;
        }

        System.out.println("=======================================");
        System.out.println("RECEIPT");
        System.out.println("=======================================");
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawalAmount);
        System.out.println("Remaining Balance: " + currentBalance );

        System.out.println("=======================================");


        input.close();

    }

}