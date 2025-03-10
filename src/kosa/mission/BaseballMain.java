package kosa.mission;

import java.util.Scanner;

public class BaseballMain {
	public static void main(String[] args) {
		Baseball b = new Baseball();
		Scanner sc = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		int input[] = new int[3];
		
		do {
			System.out.println(count +" 회차 시작");
			System.out.println("숫자 입력: ");
			for(int i = 0;i<3; i++) {
				input[i] = sc.nextInt();
			}
			strike = b.countStrike(input);
			ball = b.countBall(input);
			System.out.println(strike + "S" + ball + "B");
			count++;
			
		} while(strike != 3);
		System.out.println(count +" 회차 성공");
	}
}