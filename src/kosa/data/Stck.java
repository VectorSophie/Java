package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class Stck {
	public static void main(String[] args) {
		Stack <Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
