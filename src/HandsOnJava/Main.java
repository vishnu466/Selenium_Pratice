package HandsOnJava;

import java.util.*;
public class Main{
	public static void main(String[] args){
    	Ticket t = new Ticket();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter no of bookings:");
    	int n = sc.nextInt();
    	
    	System.out.println("Enter the available tickets:");
    	Ticket.setAvailableTickets(sc.nextInt());
		
    	while(n>0) {
    		
    		System.out.println("Enter the ticketid:");
    		int tkt_id = sc.nextInt();
    		
    		t.setTicketId(tkt_id);
    		System.out.println("Enter the price:");
    		int p = sc.nextInt();
   
    		t.setPrice(p);
    		System.out.println("Enter the no of tickets:");
    		int n_tkt = sc.nextInt();
    		System.out.println("Available tickets:"+Ticket.getAvailableTickets());
        	System.out.println("Total amount:"+t.calculateTicketCost(n_tkt));
        	System.out.println("Available tickets after bookings:"+Ticket.getAvailableTickets());
        	n--;
    	}
    	
    	sc.close();
    }
}