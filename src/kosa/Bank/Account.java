package kosa.Bank;

public class Account {
	private String id;
	private long balance;
	
	public Account(){}
	
	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit (long amount) {
		balance += amount;
	}
	
	public boolean withdraw (long amount) {
		if (balance < amount) {
			return false;
			
		} else {
			balance -= amount;		
			return true;
		}
	}
	
}
