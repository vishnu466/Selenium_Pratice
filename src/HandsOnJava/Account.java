package HandsOnJava;

public class Account {

	private int accountId, balance;
	private String accountType;
	
	public Account(int accountid, String accountType, int balance) {
		this.accountId = accountid;
		this.accountType = accountType;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public boolean withdraw(int withdraw) {
		if(this.balance >= withdraw) {
			this.balance = this.balance - withdraw;
			System.out.println("Balance amount after withdraw:"+this.balance);
			return true;
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
	
	
}
