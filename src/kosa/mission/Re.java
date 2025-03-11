package kosa.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Re {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<String> list = new ArrayList<String>();
	
	do {
		System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
		String input = sc.nextLine();
		switch (input) {
		case "1":
			System.out.println("추가: ");
			String add = sc.nextLine();
			list.add(add);
			break;
		case "2":
			System.out.println("삭제: ");
			String remove = sc.nextLine();
			list.remove(list.indexOf(remove));
			break;
		case "3":
			System.out.println("출력: ");
			for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
			break;
		case "4":
			System.out.println("종료");
			return;
		}
		} while(true);
	}
}
