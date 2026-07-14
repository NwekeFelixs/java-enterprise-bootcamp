
import java.util.Scanner;



public class CinemaTicketBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is Your Name: ");
        String customerName = input.nextLine();
        System.out.print("How Old Are You: ");
        int customerAge = input.nextInt();
        if (customerAge < 0 ) {
            System.out.println("Your Age Cannot be Negative");
            input.close();
        }

        System.out.print("How Many Tickets Do You Need: ");
        int numberOfTicket = input.nextInt();
        if (numberOfTicket <= 0) {
            System.out.println("You Can't order for Zero Or Negative Tickets");
            input.close();
        }

        double ticketPrice = 0;
        if (customerAge < 13 ){
            ticketPrice = 2000;
        }else if(customerAge >= 13 && customerAge < 18) {
            ticketPrice = 3000;
        } else if ( customerAge >= 18 && customerAge < 60) {
            ticketPrice = 5000;
        }else if (customerAge > 59 ){
            ticketPrice = 2500;
        }
        double totalTicketPrice = numberOfTicket * ticketPrice;
        if (numberOfTicket >= 5) {
            totalTicketPrice = totalTicketPrice - (totalTicketPrice * 0.10);
        }

        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Age: " + customerAge);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number Of Tickets: " + numberOfTicket);
        System.out.println("Total: " + totalTicketPrice);

        input.close();

    }
}
