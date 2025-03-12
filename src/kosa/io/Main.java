package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	Member m;
	
	public void insert() {
		m = new Member("iggymale");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Main.ser"));
			oos.writeObject(m);
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch(Exception e2) {
				
			}
		}
	}
	
	public void exsert() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("Main.ser"));
			m = (Member)ois.readObject();
		} catch(Exception e) {
			
		} finally {
			try {
				ois.close();
			} catch(Exception e2) {
				
			}
		}
	}
	public static void main(String[] args) {
		Main mnm = new Main();
		mnm.insert();
		mnm.m = null;
		mnm.exsert();
		
		System.out.println(mnm.m);
	}
}
