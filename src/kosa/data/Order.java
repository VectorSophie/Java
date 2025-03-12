package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;

public class Order {
	private Food food;
	private int amount;
	private int total;
	
	public Order() {}
	
	public Order(Food food, int amount) {
		this.food = food;
		this.amount = amount;
		this.total = food.getPrice() * amount;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void show() {
		food.show();
		System.out.println("주문수량: " + amount);
		System.out.println("주문가격: " + total);
	}
	
}
