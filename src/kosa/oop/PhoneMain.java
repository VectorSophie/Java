package kosa.oop;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneManager m = new PhoneManager();
		
		while(true) {
			System.out.println("1.추가 2.전체출력 3.검색 4.종료");
			String menu = sc.nextLine();
			switch(menu) {
			case "1":
				m.addName();
				break;
			case "2":
				m.showAll();
				break;
			case "3":
				m.searchName();
				break;
			case "4":
				System.out.println("종료");
				return;
			}
		}
	}
}
