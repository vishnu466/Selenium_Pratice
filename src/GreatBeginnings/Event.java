package GreatBeginnings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Event{
	String eventId;
	String eventType;
	Date dateOfRegistration;
	Date dateOfEvent;
	double payment;
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public Date getDateOfEvent() {
		return dateOfEvent;
	}
	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	public Event() {
		super();
	}
	public Event(String eventId, String eventType, Date dateOfRegistration, Date dateOfEvent, double payment) {
		super();
		this.eventId = eventId;
		this.eventType = eventType;
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfEvent = dateOfEvent;
		this.payment = payment;
	}
	
	public double calculateTotalAmountToBePaid() {
		if(payment>0) {
			switch(eventType.toUpperCase()) {
				case "WEDDINGS":
					return payment - (payment * 0.12);
				case "CHARITY":
					return payment - (payment * 0.09);
				case "PRODUCTLAUNCH":
					return payment - (payment * 0.15);
				case "EXHIBITIONS":
					return payment - (payment * 0.05);
				case "WORKSHOPS":
					return payment - (payment * 0.07);
				default:
					return -1;
			
			}
		}
		else
			return -1;
	}
	public String formatDate(Date d) {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		return f.format(d);
	}
	
	
}
