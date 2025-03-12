package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;
	
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int total = 0;
	
	public static void newOrder(LinkedList<Order> list) {
		System.out.println("메뉴: ");
		String foodName = sc.nextLine();
		System.out.println("가격: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("수량: ");
		int amount = Integer.parseInt(sc.nextLine());
		
		list.offer(new Order(new Food(foodName,price), amount));
	}
	
	public static void orderService(LinkedList<Order> list) {
		if(!list.isEmpty()) {
			Order order = list.poll();
			order.show();
			total += order.getTotal();
		}
	}
	public static void main(String[] args) {
		LinkedList<Order> list = new LinkedList<Order>();
	
		while(true) {
			System.out.println("1.주문 2.주문처리 3.총수익");
			switch(sc.nextLine()) {
			case "1":
				newOrder(list);
				break;
			case "2":
				orderService(list);
				break;
			case "3":
				System.out.println("전체 매출액: " + total);
				break;
			}
		}
	}
}
