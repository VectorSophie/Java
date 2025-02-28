package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account("1", "heathcliff", 10000);//°´Ã¼ »ý¼º
		Account account2 = new Account("2", "ishmael", 20000);
		
		account.deposit(5000);
		
		try {
			account.withdraw(10000);
		}catch (Exception e){
			e.printStackTrace();
		}

		account.printAccount();
		account2.printAccount();
	}

}
