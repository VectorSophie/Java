package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Buffer {
	public static void main(String[] args) {
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("ÀÔ·Â: ");
			String str = "";
			while((str = br.readLine()) != null) {
				str += "\n";
				bw.write(str);
			}
			System.out.println("³¡");
		} catch(Exception e){

		} finally {
			try {
				br.close();
				bw.close();
			} catch(Exception e2) {
				
			}
		}
	}
}
