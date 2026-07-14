
import java.util.Scanner;

public class RestaurantBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Food Price: ");
        double foodPrice = input.nextDouble();
        if (foodPrice < 0) {
            System.out.println("Food price cannot be a negative number");
            input.close();
            return;
        }
        System.out.print("Drink Price: ");
        double drinkPrice = input.nextDouble();
        if (drinkPrice < 0) {
            System.out.println("Drink price cannot be a negative number");
            input.close();
            return;
        }

        double subtotal = foodPrice + drinkPrice;
        double vat = subtotal * 0.075;
        double grandTotal = subtotal + vat;
        String gift = "None";
        if (grandTotal >= 50000) {
            gift = "Dessert";
            System.out.println("Congratulations! You qualify for a free " + gift + ".");
        } else {
            gift = "No free dessert";
            System.out.println(gift);
        }

        System.out.println("===========================");
        System.out.println("RESTAURANT BILL");
        System.out.println("===========================");
        System.out.println("");
        System.out.println("Customer: " + name);
        System.out.println("Food: " + foodPrice);
        System.out.println("Drink: " + drinkPrice);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("VAT: " + vat);
        System.out.println("Grand Total " + grandTotal);
        System.out.println("Gift: " + gift);
        System.out.println("");
        System.out.println("===========================");

        input.close();
    }
}
