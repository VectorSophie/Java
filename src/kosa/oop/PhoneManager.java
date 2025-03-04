package kosa.oop;

import java.util.Scanner;

public class PhoneManager {
	private PhoneBook arr[];
	private int count;
	private Scanner sc;
	
	public PhoneManager () {
		arr = new PhoneBook [5];
		sc = new Scanner(System.in);
		int count = 0;
	}
	public void addName () {
		System.out.println("이름: ");
		String Nombre = sc.nextLine();
		System.out.println("전화번호: ");
		String Numero = sc.nextLine();
		System.out.println("생년월일: ");
		String Cumple = sc.nextLine();
		
		arr[count++] = new PhoneBook(Nombre, Numero, Cumple);
		System.out.println("전화번호가 등록되었습니다");
	}
	public void showAll () {
		for (int i = 0; i<count; i++) {
			arr[i].show();
		}
	}
	public void searchName () {
		System.out.println("검색: ");
		String Target = sc.nextLine();
		for (int i = 0; i<count; i++) {
			if (arr[i].getName().equals(Target)) {
				arr[i].show();
				break;
			} else {
				System.out.println("일치하는 사용자 없음");
				break;
			}
		}
	}
}
