package PracticeJava;
import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook = new ArrayList<>();
    
    public void setPhoneBook(List<Contact> phoneBook){
        this.phoneBook = phoneBook;
    }
    public List<Contact> getPhoneBook(){
        return phoneBook;
    }
    
    public void addContact(Contact contactObj){
        phoneBook.add(contactObj);
    }
    
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    
    public Contact viewContactGivenPhone(long phoneNumber){
		for(Contact contact : phoneBook) {
			if(contact.getPhoneNumber() == phoneNumber) {
				return contact;
			}
		}
		return null;   
    }
    
    public boolean removeContact(long PhoneNumber) {
    	Contact contact = viewContactGivenPhone(PhoneNumber);
    	if(contact == null) {
    		return false;
    	}
    	return phoneBook.remove(contact);
    }
    
}