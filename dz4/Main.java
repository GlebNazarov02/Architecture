package dz4;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        
        Ticket ticket1 = new Ticket(1,TypeTransport.Bus,25.00, "MGD", LocalDateTime.now());
        Customer customer1 = new Customer(1,new CashProvider(30.00,ticket1.getPrice()));
        customer1.buyTicket(ticket1);
        System.out.println(customer1);
    }
}