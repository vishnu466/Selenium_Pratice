package CodeChallenge;

import java.util.Scanner;

class UserInterface {
    public static MovieTickets extractDetails(String movieDetails) {
        String[] str = movieDetails.split(":");
        MovieTickets obj = new MovieTickets();
        obj.setMovieName(str[0]);
        obj.setScreenNumber(str[1]);
        obj.setNoOfTickets(Integer.parseInt(str[2]));
        obj.setMobileNumber(str[3]);
        obj.setTime(str[4]);
        obj.setModeOfPayment(str[5]);
        return obj;
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the details ");
        String input = sc.nextLine();
 
        MovieTickets ui = extractDetails(input);
        if(ui.calculatePrice() == 0 || ui.generateTicketId()== "Invalid Movie details") {
        	System.out.println("Invalid movie details");
        }
        else {
        	System.out.println("Ticket Details");
            System.out.println("Movie Name: " + ui.getMovieName());
            System.out.println("Screen Number: " + ui.getScreenNumber());
            System.out.println("Number of tickets: " + ui.getNoOfTickets());
            System.out.println("Show Timing: " + ui.getTime());
            System.out.println("Ticket Cost: " + ui.calculatePrice());
            System.out.println("TicketId: " + ui.generateTicketId());
            System.out.println("Thank you! Your payment received via " + ui.getModeOfPayment()+", Your movie tickets are confirmed. ");
        }
        sc.close();
        
    }
}