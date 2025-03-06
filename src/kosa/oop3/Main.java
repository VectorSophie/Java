package kosa.oop3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CEO role = new CEO();
		Scanner sc = new Scanner(System.in);
       
        System.out.print("¿Ã∏ß: ");
        String name = sc.nextLine();
		
		Person person = new Person(name, role);
		person.doIt();
		sc.close();
	}
}