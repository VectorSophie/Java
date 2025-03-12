package kosa.io;

import java.io.File;

public class Files {
	public static void main(String[] args) {
		String source = "D:\\AI_AGENT\\workspace\\java\\rickroll.jpg";
		String dest = "D:\\AI_AGENT";
		
		File sourcefile = new File(source);
		File destfile = new File(dest);
	
		CopyUtil.copyFile(sourcefile, destfile); 
	}
}
