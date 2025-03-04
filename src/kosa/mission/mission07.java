package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class mission07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int rnum1 = r.nextInt(100) + 1;
		int n = 0;
		int count = 0;
		while(true) {
		
			do {
				System.out.println("정수 입력: ");
				n = sc.nextInt();
			
			} while (n>100 || n<1);
			count ++;
		
			if (rnum1 == n) {
				System.out.println(count + "번 시도 성공");
				break;
			}else if (rnum1 > n) {
				System.out.println("up");
			} else if (rnum1 < n) {
				System.out.println("down");
			}
		}
		sc.close();
	}
}
