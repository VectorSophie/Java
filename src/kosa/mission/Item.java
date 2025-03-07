package kosa.mission;

public class Item {
	private int number;
	private String name;
	private int price;
	
	public Item () {}

	public Item(int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("力前 锅龋:"+ number);
		System.out.println("力前 捞抚:"+ name);
		System.out.println("力前 啊拜:"+ price);
		
	}
	
	public void discountApply(int discRate) {
		this.price = price * (100-discRate);
	}
}
