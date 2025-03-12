package kosa.io;

import java.util.Scanner;
import java.io.FileWriter;

public class Writer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String str = "";
		String poem = "";
		System.out.println("입력: ");
		while(!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
			
			try {
				writer = new FileWriter("poem2.txt");
				writer.write(poem);
			} catch(Exception e) {
			
			} finally {
				try {
					writer.close();
				} catch (Exception e2) {
					
				}
			}
		}
		System.out.println("종료");
		System.out.println(poem);
		sc.close();
	}

}
