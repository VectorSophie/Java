package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount(){}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount)throws Exception {
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("잔액부족");
		}
		return withdraw(amount);
	}

	//Override
	public void printAccount() {
		super.printAccount();
		System.out.println("카드 번호: " + cardNo);
	}
	
	
	
}
