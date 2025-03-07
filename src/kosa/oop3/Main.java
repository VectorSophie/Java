package kosa.oop3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student role = new Student();
		Scanner sc = new Scanner(System.in);
  
		Person person = new Person("ȫ�浿", role);
		person.doIt();
		sc.close();
	}
}