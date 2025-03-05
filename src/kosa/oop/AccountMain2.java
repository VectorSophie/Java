package kosa.oop;

public class AccountMain2 {
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("111-111", "ȫ�浿",5000, "0000-0000");
		try {
			ca.pay("0000-0000", 5100);
		} catch (Exception e){
			e.printStackTrace();
		}
		ca.printAccount();
	}
}


