package kosa.mission;

import java.util.List;
import java.util.Scanner;

public class ShoppingMain {
	public void main(String[] args) {
		ShoppingManager sm = new ShoppingManager();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.장바구니 추가 2.장바구니 목록 3.종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.println("아이템 번호:");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("아이템 이름:");
				String nam = sc.nextLine();
				System.out.println("아이템 가격:");
				int pri = Integer.parseInt(sc.nextLine());
				sm.addItem(num, nam, pri);
				break;
			case 2:
				System.out.println("전체 목록: ");
				sm.total();
				break;
			case 3:
				System.out.println("종료");
				return;
			}
		}
	}
	
}
