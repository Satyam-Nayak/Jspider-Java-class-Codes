//write a java program for ticket where ticketcounter as an object 
//ticket counter 
// -no of tickets
// -counterNumber
//parameterised counter
//methods: (1) buytickets 'n' (applying condition)
//(2) canceltickets 'n'
//viewtotaltickets

import java.util.Scanner;

class TicketCounter {
    int noOfTickets;
    int counterNumber;

    TicketCounter(int noOfTickets, int counterNumber) {
        this.noOfTickets = noOfTickets;
        this.counterNumber = counterNumber;
    }

    void buyTickets(int n) {
        if (n <= noOfTickets) {
            System.out.println("Ticket bought successfully");
            noOfTickets = noOfTickets - n;
        } else {
            System.out.println("Sorry, no tickets available");
        }
    }

    void cancelTickets(int n) {
        if (n <= noOfTickets) {
            System.out.println("Ticket cancelled successfully");
            noOfTickets = noOfTickets - n;
        } else {
            System.out.println(", no tickets available");
        }
    }

    void viewTotalTickets() {
        System.out.println("Total tickets available: " + noOfTickets);
    }
}

public class tickets {
    public static void main(String[] args) {
        System.out.println("main method started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tickets: ");
        int noOfTickets = sc.nextInt();
        System.out.println("Enter the counter number: ");
        int counterNumber = sc.nextInt();
        TicketCounter tc = new TicketCounter(noOfTickets, counterNumber);
        System.out.println("Enter the number of tickets to buy: ");
        int n = sc.nextInt();
        tc.buyTickets(n);
        System.out.println("Enter the number of tickets to cancel: ");
        n = sc.nextInt();
        tc.cancelTickets(n);
        tc.viewTotalTickets();

        System.out.println("main method ended");

    }

}
