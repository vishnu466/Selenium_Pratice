package CodeChallenge;

import java.util.Arrays;

public class MovieTickets {
	
	private String movieName;
	private String screenNumber;
	private int noOfTickets;
	private String mobileNumber;
	private String time;
	private String modeOfPayment;
	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(String screenNumber) {
		this.screenNumber = screenNumber;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public MovieTickets(String movieName, String screenNumber, int noOfTickets, String mobileNumber, String time, String modeOfPayment) {
		super();
		this.movieName = movieName;
		this.screenNumber = screenNumber;
		this.noOfTickets = noOfTickets;
		this.mobileNumber = mobileNumber;
		this.time = time;
		this.modeOfPayment = modeOfPayment;
	}
	
	public MovieTickets() {
		super();
	}
		
	public double calculatePrice(){
		double total_price = 0.0;
		double charge = 35.0;
		String[] screen_no = {"S1","S2","S3","S4","S5"}; ;

	    if(!((Arrays.asList(screen_no).contains(screenNumber)) ||  noOfTickets <=0)){
		        return 0;
		}
	    else{
	    	switch(screenNumber) {
		    	case "S1":{
		            total_price = (double)noOfTickets * 280.0 + charge;
		            break;
		        }
		    	case "S2" :{
		            total_price = (double)noOfTickets * 250.0 + charge;
		            break;
		        }
		    	case "S3" :{
		            total_price = (double)noOfTickets * 520.0 + charge;
		            break;
		        }
		    	case "S4" :{
		            total_price = (double)noOfTickets * 400.0 + charge;
		            break;
		        }
		    	case "S5" :{
		            total_price = (double)noOfTickets * 180.0;
		            break;
		        }
	    	}
	    }
		return total_price;
	}
	
	public String generateTicketId(){
		String[] s = {"S1","S2","S3","S4","S5"};
		
	    if(!((Arrays.asList(s).contains(screenNumber)) || noOfTickets<=0)){
	        return "Invalid movie";
	    }
		return getConsonants(movieName) + screenNumber + "N" + getNoOfTickets();
	}
	public static String getConsonants(String str) {
		str = str.replaceAll("[aeiouAEIOU]","");
		return str.substring(0,2);
	}
}



