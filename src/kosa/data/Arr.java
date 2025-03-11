package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Arr {
	public static void main(String[] args) {
		
		Random r = new Random();
		List<Integer> list = new ArrayList<Integer>();
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
			}	
	
		do {
			int n = r.nextInt(45) + 1;
			if(list.contains(n)) {
				continue;
			} else {
				list.add(n);
			}
		} while(list.size()!=6);
		
		Collections.sort(list);
		System.out.println(list);
		
	
	Set<Integer> set = new TreeSet<Integer>();
	
	for(int i=0; set.size()<6; i++) {
		set.add(r.nextInt(45) + 1);
	}
	System.out.println(set);
	}
	
}
