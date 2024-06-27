package HandsOnJava;

public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public void setTicketId(int ticketId){
        this.ticketid = ticketId;
    }	
    public int getTicketId(){
        return ticketid;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public static void setAvailableTickets(int avb_tkt){
        if(!(avb_tkt<=0))
            Ticket.availableTickets = avb_tkt;
        else {
        	
        	System.exit(0);
        } 
    }
    public static int getAvailableTickets(){
        return Ticket.availableTickets;
    }
    
    public int calculateTicketCost(int no_of_tickets){
    	if(Ticket.availableTickets >= no_of_tickets) {
    		Ticket.availableTickets = Ticket.availableTickets - no_of_tickets;
    		return no_of_tickets * price;
    	}
    	else {
    		return -1;
    	}
    }
    
}
