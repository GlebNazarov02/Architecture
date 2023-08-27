package dz4;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;

public class Customer {
    private int id;
    private CashProvider cash;
    private List<Ticket> tickets;
    

    public Customer(int id,CashProvider cash) {
        this.id = id;
        this.tickets = new ArrayList<>();
        this.cash = cash;
    }

    public int getId() {
        return id;
    }

    public void setCash(CashProvider cash) {
        this.cash = cash;
    }

    public boolean buyTicket(Ticket ticket) {
        if (cash.cardHasFunds()) {
            cash.buy();
            tickets.add(ticket);
            return true;
        } 
        else {
            throw new RuntimeException("ошибка");
        }
    
      
       
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", tickets=" + tickets +
                ", cash=" + cash +
                '}';
    }

    public List<Ticket> search(LocalDateTime date, long rootNumber) {
        List<Ticket> SearchTickets = new ArrayList<>();
        for (Ticket ticket: tickets){
            if ((ticket.getDate() == date) && (ticket.getRootNumber() == rootNumber)){
                SearchTickets.add(ticket);
            } 
        }
        return SearchTickets; 
}
}