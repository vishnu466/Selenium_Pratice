package HandsOnJava;

import java.util.*;

public class AccountDetails{
	static Scanner sc = new Scanner(System.in);
    public static Account getAccountDetails(){
    	//sc.nextLine();
    	System.out.println("Enter account id:");
    	int ac_id = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter account type:");
    	String ac_type = sc.nextLine();
    	
    	int bal ;
        do{
        	System.out.println("Enter balance:");
        	bal = sc.nextInt();
            if(bal <= 0){
                System.out.println("Balance should be positive");
                
            } 
        }while(bal<=0);
        return new Account(ac_id,ac_type,bal);
    }
    public static int getWithdrawAmount() {
    	
    	int withdraw_amt;
    	do{
    		System.out.println("Enter amount to be withdrawn:");
    		withdraw_amt = sc.nextInt();
            if(withdraw_amt <= 0){
                System.out.println("Amount should be positive");
                
            } 
        }while(withdraw_amt<=0);
    	
    	return withdraw_amt;
		
    }
    public static void main(String[] args) {
    	Account a = getAccountDetails();
    	int withdraw_amount = getWithdrawAmount();
    	a.withdraw(withdraw_amount);
    }
}