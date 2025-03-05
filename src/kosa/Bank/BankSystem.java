package kosa.Bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankSystem {
	private MyBank MyBank;		//MyBank 
	
	public BankSystem(){	
		MyBank = new MyBank();
		showMenu();
	}
	
	public void showMenu(){		//show method 만들기
		String  menu = null;			
		String id = null;
		String name = null;
		long balance = 0;
		
		do{
		
			System.out.println("****메뉴를 입력하세요****");
			System.out.println("1. 고객등록");
			System.out.println("2. 고객보기(1명)");
			System.out.println("3. 고객전체보기");
			System.out.println("4. 고객예금출금");
			System.out.println("***끝내기***");
			System.out.println("***************");
			System.out.print(">>");			
			
			menu = readFromKeyboard();			
		
			if(menu.equals("1")){				//고객등록
				
				System.out.print("ID를 입력하세요: ");
				id = readFromKeyboard();
				
				System.out.print("이름을 입력하세요: ");
				name = readFromKeyboard();
				
				System.out.print("잔고를 입력하세요: ");
				balance = Long.parseLong(readFromKeyboard());
				
				MyBank.addCustomer(id, name, balance);
				
			}else if(menu.equals("2")){
				System.out.print("고객ID를 입력하세요: ");
				id = readFromKeyboard();
				Customer cust = MyBank.getCustomer(id);
				System.out.println(cust.getId() +":" + cust.getName() + ": "
						+ cust.getAccount().getBalance());	
			
			}else if(menu.equals("3")){
				
				Customer[] allCust = MyBank.getAllCustomer();
				
				for(int i=0;i<allCust.length;i++){
					System.out.println(allCust[i].getId() + ": " +
													allCust[i].getName() + " :" +
													allCust[i].getAccount().getBalance());
				}
				
			}else if(menu.equals("4")){
				
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = MyBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");
				
				}else{
					System.out.print("출금액을 입력하세요: ");
					balance = Long.parseLong(readFromKeyboard());
					
					if(cust.getAccount().withdraw(balance)){
						System.out.println("정상적으로 출금되었습니다.");
						System.out.println("출금후 잔고는 :" + cust.getAccount().getBalance());
					}else{
						System.out.println("잔고가 부족합니다.");
					}
				}
				
			}else if(menu.equals("5")){
				
				System.out.print("고객의 ID를 입력하세요.: ");
				id = readFromKeyboard();
				
				Customer cust = MyBank.getCustomer(id);
				
				if(cust == null){
					System.out.println("등록된 고객이 아닙니다.");
				
				}else{
					System.out.print("입금액을 입력하세요: ");
					balance = Long.parseLong(readFromKeyboard());
					
					if(cust.getAccount().deposit(balance)){
						System.out.println("정상적으로 출금되었습니다.");
						System.out.println("출금후 잔고는 :" + cust.getAccount().getBalance());
					}else{
						System.out.println("잔고가 부족합니다.");
					}
				}
				
			}
			
			
		}while(!menu.equals("q"));
	}
	


	public String readFromKeyboard(){
		String input = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return input;
	}
	
	public static void main(String[] args) {
		BankSystem bank = new BankSystem();

	}

}