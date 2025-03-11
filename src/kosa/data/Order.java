package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;

public class Order {
	private Food food;
	private int amount;
	private LinkedList<Food> list;
	
	public Order() {
		this.list = new LinkedList<>();
	}
	
	public Order(Food food, int amount, LinkedList list) {
		this.food = food;
		this.amount = amount;
		this.list = list;
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
	
	public void newOrder(Food food, int amount) {
		for (int i=0; i<amount; i++)
		list.offer(food);
	}
	
	public void printOrder() {
		while(!list.isEmpty()) {
			System.out.println(list.poll());
		}
	}
	
	public void total() {
		Iterator<Food> iter = list.iterator();
		int i = 0;
		while(iter.hasNext()) {
			i += iter.next().getPrice() * amount;
		}
		System.out.println(i);
			
	}
		
}
