package kosa.phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneManager m = new PhoneManager();
		PhoneManagerList l = new PhoneManagerList();
		
		while(true) {
			System.out.println("1.추가 2.전체출력 3.검색 4.수정 5.삭제 6.종료");
			String menu = sc.nextLine();
			switch(menu) {
			case "1":
				l.addName();
				break;
			case "2":
				l.showAll();
				break;
			case "3":
				l.searchName();
				break;
			case "4":
				l.replaceName();
				break;
			case "5":
				l.deleteName();
				break;
			case "6":
				System.out.println("종료");
				return;
			}
		}
	}
}
