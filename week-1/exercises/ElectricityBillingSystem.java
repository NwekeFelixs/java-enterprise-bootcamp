
import java.util.Scanner;

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is Your Name: ");
        String customerName = input.nextLine();
        System.out.print("How Many Units: ");
        double units = input.nextDouble();
        if (units < 0 ) {
            System.out.println("Units Cannot be Negative");
            input.close();
        }

        double costPerUnit = 75;
        double energyCharge = costPerUnit * units;
        double surcharge = 0;
        if (energyCharge >= 30000) {
            surcharge = energyCharge * 0.05;
        } else {
            surcharge = 0;
        }
        
        double finalBill = energyCharge + surcharge;

        System.out.println("=============================");
        System.out.println("Electricity Bill Reciept");
        System.out.println("=============================");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total: " + finalBill);
        System.out.println("=============================");

        input.close();
    }
}
