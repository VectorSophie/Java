package kosa.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CopyUtil {
		public static void copyFile(File source, File dest) {
			
				ObjectOutputStream oos = null;
				try {
					oos = new ObjectOutputStream(new FileOutputStream(source));

				} catch(Exception e){
					e.printStackTrace();
				} finally {
					try {
						oos.close();
					} catch(Exception e2) {
						
					}
				}
				
				ObjectInputStream ois = null;
				try {
					ois = new ObjectInputStream(new FileInputStream(dest));
				} catch(Exception e) {
					
				} finally {
					try {
						ois.close();
					} catch(Exception e2) {
						
					}
				
				}
		}
}
