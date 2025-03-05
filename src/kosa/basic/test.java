package kosa.basic;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String full = "Hello world";
		String greeting = full.substring(0,5);
		System.out.print("User: ");
		String user = sc.nextLine();
		System.out.println(greeting + ", " + user+ "!");
		sc.close();
	}
}
