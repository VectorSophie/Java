package kosa.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Re {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<String> list = new ArrayList<String>();
	
	do {
		System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
		switch (sc.nextLine()) {
		case "1":
			System.out.println("추가: ");
			list.add(sc.nextLine());
			break;
		case "2":
			System.out.println("삭제: ");
			list.remove(list.indexOf(sc.nextLine()));
			break;
		case "3":
			System.out.println("출력: ");
			for(int i=0; i<list.size(); i++) 
				System.out.print(list.get(i) + ",");
			System.out.println();
			Iterator<String> iter = list.iterator();
			while(iter.hasNext()) 
				System.out.print(iter.next() + ",");
			System.out.println();
			break;
		case "4":
			System.out.println("종료");
			return;
		}
		} while(true);
	}
}
