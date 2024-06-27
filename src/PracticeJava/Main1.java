package PracticeJava;

import java.util.*;

public class Main1{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice=0;
        do{
            System.out.println("Menu");
            System.out.println("1.Add Contact");
            System.out.println("2.Display all contacts");
            System.out.println("3.Search contact by phone");
            System.out.println("4.Remove contact");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:{
                	System.out.println("Enter the First Name:");
                    String f_name = sc.nextLine();
                    System.out.println("Enter the Last Name:");
                    String l_name = sc.nextLine();
                    System.out.println("Enter the Phone No.:");
                    long num = sc.nextLong();
                    System.out.println("Enter the Email:");
                    String email_id = sc.nextLine();
                    Contact obj1 = new Contact(f_name,l_name,num,email_id);
                    phoneBook.addContact(obj1);
                    break;
                }
                case 2:{
                	System.out.println("The contacts in the List are:");
                	for(Contact contact : phoneBook.viewAllContacts()) {
                		System.out.println("First Name: "+contact.getFirstName());
                		System.out.println("Last Name: "+contact.getLastName());
                		System.out.println("Phone no: "+contact.getEmailId());
                		System.out.println("Email: "+contact.getEmailId());
                	}
                    break;
                }
                case 3:{
                	System.out.println("Enter the Phone number to search contact:");
                	long c = sc.nextLong();
                	Contact con = phoneBook.viewContactGivenPhone(c);
                	System.out.println("The contact is:");
                	System.out.println("First Name: "+con.getFirstName());
            		System.out.println("Last Name: "+con.getLastName());
            		System.out.println("Phone no: "+con.getEmailId());
            		System.out.println("Email: "+con.getEmailId());
                }
                case 4:{
                	System.out.println("Enter the Phone number to remove:");
                	Long r_contact = sc.nextLong();
                	System.out.println("Do you want to remove the contact (Y/N):");
                	String option = sc.next();
                	if(option.equals("Y")) {
                		phoneBook.removeContact(r_contact);
                		System.out.println("The contact is successfully deleted.");
                	}
                	else
                		return;
                }
            }
   
        }while(choice == 5);
        sc.close();
    }
    
}