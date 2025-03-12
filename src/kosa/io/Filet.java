package kosa.io;

import java.io.File;

public class Filet {
	
	public static void show(File file) {
		File list[] = file.listFiles();
		
		for(int i=0; i<list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("--- " + list[i] + " ---");
				show(list[i]);
			} else {
				System.out.println("- " + list[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String path = "D:\\AI_AGENT\\workspace\\java\\AI_AGENT";
		File f = new File(path);
		show(f);
		
		
//		if(f.isDirectory()) {
//			System.out.println("d");
//		} else {
//			System.out.println("c");
//		}
	}
}
