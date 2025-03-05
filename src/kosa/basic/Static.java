package kosa.basic;

import java.util.Scanner;
public class Static {
	int total;//필드, 메서드 소유(계속 생성됨), 0으로 초기화
	static int Total; //정적, 클래스 소유(클래스 로딩 필요), 0으로 초기화
	
	public void add() {
		total += 10; 
		Total += 10;
	}
	
	public static void staticadd() {
		//total += 10; //static 시점에서 객체는 생성되지 않음
		Total += 10;
	}
	
	public static void main(String[] args) {
		Static se = new Static();
		Static sm = new Static();
		se.add();
		sm.add();
		staticadd(); //정적이라 obj로 다시 가져올 필요없음
		
		System.out.println(se.total); //total은 각각 메모리가 별도로 생성되서 따로
		System.out.println(Static.Total); //Total은 한번만 생성되어서 add 두번 실행, 같은 메모리 쳐다봄
		System.out.println(sm.total);
		System.out.println(Static.Total);
	}
}
