package kosa.mission;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member arr[] = new Member[10];
		int i = 0;
		while(true) {
			System.out.println("이름: ");
			String name = sc.nextLine();
			System.out.println("나이: ");
			int age = Integer.parseInt(sc.nextLine());
			
			arr[i++] = new Member(name, age);
			if (i == 3) break;
		}
		for (int j = 0; j <i; j++) {
			arr[j].print();
		}
		sc.close();
	}
}
