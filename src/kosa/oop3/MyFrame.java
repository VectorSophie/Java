package kosa.oop3;

import java.awt.Frame;
import java.awt.Button;

public class MyFrame extends Frame {
	
	public MyFrame() {
		Button b = new Button("¹öÆ°");
		add(b);
		
		setSize(300,300);
		setLocation(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
