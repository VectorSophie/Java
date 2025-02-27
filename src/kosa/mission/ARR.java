package kosa.mission;

import java.util.Scanner;

public class ARR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String arr[] = new String[10]; 
		int i = 0;
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
			arr[i] = input;
			i++;
		} while (!input.equals("q"));
		System.out.print("출력: ");
		for (int j = 0; j<i; j++) {
			System.out.print(arr[j] + ", ");
		}
		sc.close();
	}
}