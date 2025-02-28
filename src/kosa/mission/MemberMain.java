package kosa.mission;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		int i = 0;
		Member member = new Member();
		do {
			System.out.println("이름 입력: ");
			name = sc.nextLine();
			System.out.println("나이 입력: ");
			age = Integer.parseInt(sc.nextLine());
			member.adduser(name,age, i);
			i++;
		} while (i<5);
		System.out.println(member.getArr());
	}

}
