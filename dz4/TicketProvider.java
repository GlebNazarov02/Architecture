package dz4;


import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
    private List<Ticket> availableTickets;

    public TicketProvider() {
        this.availableTickets = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket) {
        return availableTickets.add(ticket);
    }

    public boolean removeTicket(Ticket ticket) {
        return availableTickets.remove(ticket);
    }

    public void getTicket(long rootNumber) {
        try{
            Integer rootNumber1 = Long.valueOf(rootNumber).intValue();
            System.out.println("Your ticket: " + availableTickets.get(rootNumber1) );  
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds.");
        }
    }

    public boolean updateTicketStatus(Ticket ticket) {
        if (ticket.isValid()){
            return true;
        }
        else{
            return false;
        }
    }
}