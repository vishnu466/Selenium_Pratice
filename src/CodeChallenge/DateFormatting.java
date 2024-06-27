package CodeChallenge;
import java.util.*;
import java.time.format.*;
import java.time.LocalDate;
public class DateFormatting {

	public static void main(String[] args) {
		String current_Date = "30/03/2019";
		String recharged_Date = "30/11/2019";
		if(isValidDate(current_Date) && dateCompare(recharged_Date,current_Date)) {
			
		}
		else {
			
		}
		//System.out.println(current_Date.compareTo(recharged_Date));

	}
	public static boolean isValidDate(String d) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
            LocalDate.parse(d, formatter);
            return true; 
        } catch (DateTimeParseException e) {
            return false; 
        }
		
	}
	public static boolean dateCompare(String c_date,String r_date) {
		if(c_date.compareTo(r_date)<=0)
			return true;
		return false;
	}
	

}
