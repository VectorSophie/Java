package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class Matematica {
	public static void main(String[] args) {
		String str = "(2+3)*5 = 25";
		Stack <String> Math = new Stack<String>();
		try {
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				if(ch == '(') {
					Math.push(ch+"");
				} else if (ch == ')') {
					Math.pop();
				}
			}
			if (Math.isEmpty()) {
				System.out.println("tttt");
			} else {
				System.out.println("ffff");
			}
		} catch(Exception e) {
			System.out.println("fff");
		}
		
	}
}

