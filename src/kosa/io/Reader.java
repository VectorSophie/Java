package kosa.io;

import java.io.FileReader;

public class Reader {	
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("poem.txt");
			while (true) {
				int data = reader.read();
				if (data == -1) break;
				System.out.println((char)data);
			}
		} catch(Exception e) {
		
		} finally {
			try {
				reader.close();
			} catch(Exception e2) {}
		}
	}
}
