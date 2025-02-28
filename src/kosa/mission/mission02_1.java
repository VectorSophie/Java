package kosa.mission;

import java.util.Scanner;

public class mission02_1 {
	public static int aver(int brr[]) {
		int average = (brr[0] + brr[1] + brr[2]) / 3;
		return average;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sub[] = {"국어", "영어", "수학"};
		int arr[] = new int[4];
		for (int i = 0; i<3; i++) {
			System.out.print(sub[i] + " 점수 입력: ");
			int input = Integer.parseInt(sc.nextLine());
			arr[i] = input;
		}
		arr[3] = aver(arr);
		System.out.println("국어\t영어\t수학\t평균");
		for (int j: arr) {
			System.out.print(j + "\t");
		}
		sc.close();
	}
}
