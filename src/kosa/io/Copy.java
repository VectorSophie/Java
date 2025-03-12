package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy {
		public static void main(String[] args) {
			FileReader reader = null;
			FileWriter writer = null;
			String poem = "";
			
			char arr[] = new char[256];
			try {
				reader = new FileReader("poem2.txt");
				while (true) {
					int data = reader.read(arr);
					if (data == -1) break;
					System.out.println(arr);
				}
			} catch(Exception e) {
		
			} finally {
				try {
					reader.close();
				} catch(Exception e2) {}
			}
			
			String poem3 = String.copyValueOf(arr);
			
			try {
				writer = new FileWriter("poem3.txt");
				writer.write(poem3);
			} catch(Exception e) {
			
			} finally {
				try {
					writer.close();
				} catch (Exception e2) {
					
				}
			}
			
		}
}
