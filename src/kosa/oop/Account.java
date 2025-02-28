package kosa.oop;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account () {}
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;//객체 생성 방식은 생성자의 내용이 결정
	}

	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw (int amount)throws Exception {
		if (balance < amount) {
			throw new Exception("잔액 부족");
		} else {
		balance -= amount;		
		return amount;
		}
	}
	public void printAccount() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
	}
}
