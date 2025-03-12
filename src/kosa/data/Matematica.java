package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class Matematica {
	public static boolean MathMatch(String str) {
		Stack <String> Math = new Stack<String>();
		
			if (str.contains("(") ) {
				Math.push("(");
			} else if (str.contains(")") ) {
				if(Math.isEmpty()) {
					return false;
				}
				Math.pop();
				}
			return Math.isEmpty();
	}
	


	public static void main(String[] args) {
		String input = "(2+3)))*5 = 25";
		if(MathMatch(input)) {
			System.out.println("예~");
		} else {
			System.out.println("아니오~");
		}
	
	}
}
