package kosa.Bank;

public class MyBank {
	private Customer[] customers;
	private int customersNum;
	
	public MyBank(){
		customers = new Customer[10];
	}
	
	public Customer getCustomer(String id) {
		Customer cust = null;
		for (int i=0; i<customersNum; i++) {
			if (customers[i].getId().equals(id)) {
				cust = customers[i];
			} else {
				System.out.println("°í°´ ¾øÀ½");
			}
		}
		return cust;
	}

	public int getCustomersNum() {
		return customersNum;
	}
	
	public void addCustomer(String id, String name, long balance) {
		 customers[customersNum++] = new Customer(id, name, balance);
	}
	
	public Customer[] getAllCustomer () {
		Customer[] totalCustomer = new Customer[customersNum];
		
		System.arraycopy(customers, 0, totalCustomer, 0, customersNum);
		
		return totalCustomer;
	}
}
