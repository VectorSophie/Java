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
		System.out.println("1.전체 2.동창 3.직장");
		System.out.println("선택: ");
		int input = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름: ");
		String Nombre = sc.nextLine();
		System.out.println("전화번호: ");
		String Numero = sc.nextLine();
		System.out.println("생년월일: ");
		String Cumple = sc.nextLine();
		
		switch (input) {
		case 1: 
			arr[count++] = new PhoneBook(Nombre, Numero, Cumple);
			break;
		case 2:
			System.out.println("전공: ");
			String major = sc.nextLine();
			System.out.println("학번: " );
			String year = sc.nextLine();
			arr[count++] = new Colleague(Nombre, Numero, Cumple, major, year);
			break;
		case 3:
			System.out.println("부서: ");
			String dept = sc.nextLine();
			System.out.println("직급: " );
			String position = sc.nextLine();
			arr[count++] = new Company(Nombre, Numero, Cumple, dept, position);
			break;
		}
		
		System.out.println("전화번호가 등록되었습니다");
	}
	public void showAll () {
		System.out.println("1.전체 2.동창 3.직장");
		System.out.println("선택: ");
		int input = Integer.parseInt(sc.nextLine());
		
		switch(input) {
		case 1:
			for (int i = 0; i<count; i++) {
				arr[i].show();
			}
			break;
		case 2:
			for (int i = 0; i<count; i++) {
				if (arr[i] instanceof Colleague) {
				arr[i].show();
			} else {
				continue;
			}
		}
			break;
			
		case 3:
			for (int i = 0; i<count; i++) {
				if (arr[i] instanceof Company) {
				arr[i].show();
			} else {
				continue;
			}
		}
			break;
			
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
