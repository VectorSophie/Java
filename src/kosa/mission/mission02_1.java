package kosa.mission;

import java.util.Scanner;

public class mission02_1 {
	public static int aver(int brr[]) {
		int average = (brr[0] + brr[1] + brr[2]) / 3;
		return average;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for (int i = 0; i<3; i++) {
			System.out.print("점수 입력: ");
			int input = Integer.parseInt(sc.nextLine());
			arr[i] = input;
		}
		System.out.println("평균: " + aver(arr));
		
	}
}
