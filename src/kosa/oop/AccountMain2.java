package kosa.oop;

public class AccountMain2 {
	public static void main(String[] args) {
		Account ca = new CheckingAccount("111-111", "��浿", 10000, "2222-2222");
		if (ca instanceof CheckingAccount) {
		CheckingAccount ca2 = (CheckingAccount)ca;
		try {
			ca2.pay("2222-2222", 3000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		ca2.printAccount();
	}
		
		Account arr[] = {
			new Account("111-111", "��浿", 10000),
			new CheckingAccount("222-222", "ȫ�浿",5000, "0000-0000"),
			new MinusAccount("333-333", "�ڱ浿",5000, 10000)
		};
		
		for (int i=0; i<arr.length;i++) {
			if(arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("0000-0000", 4000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			arr[i].printAccount();
		}
		
		MinusAccount ma = new MinusAccount("111-111", "ȫ�浿",5000, 10000);
		
		try {
			ma.withdraw(7000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		ma.printAccount();
		
		CheckingAccount ca3 = new CheckingAccount("111-111", "ȫ�浿",5000, "0000-0000");
		try {
			ca3.pay("0000-0000", 1000);
		} catch (Exception e){
			e.printStackTrace();
		}
		ca.printAccount();
	}
}


