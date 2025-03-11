package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order o = new Order();
		Food jj = new Food("Â¥Àå", 4000);
		Food jb = new Food("Â«»Í", 5000);
		
		o.newOrder(jj,5);
		o.newOrder(jb, 4);
		o.printOrder();
		o.total();
	}
}
