package GreatBeginnings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserInterface {
	public static Event extractDetails(String eventDetails) throws ParseException{
		String e[] = eventDetails.split(":");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = formatter.parse(e[2]);
		Date d2 = formatter.parse(e[3]);
		return new Event(e[0],e[1],d1,d2,Double.parseDouble(e[4]));
	}
	public static void main(String[] a) throws ParseException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Event Details");
		Event ev = extractDetails(sc.nextLine());
		if(ev.calculateTotalAmountToBePaid() !=-1) {
			System.out.println("Enter Id:"+ev.getEventId());
			System.out.println("Enter Type:"+ev.getEventType());
			System.out.println("Date Of Registration:"+ev.formatDate(ev.getDateOfRegistration()));
			System.out.println("Date Of Event:"+ev.formatDate(ev.getDateOfEvent()));
			System.out.printf("Amount to be paid by the Customer:%.2f",ev.calculateTotalAmountToBePaid());
		}
		else {
			System.out.println("Invalid Event Details");
		}
	}
}
