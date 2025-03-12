package kosa.io;

import java.io.FileReader;

public class Reader {	
	public static void main(String[] args) {
		FileReader reader = null;
		char arr[] = new char[256];
		try {
			reader = new FileReader("poem.txt");
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
	}
}
