package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Oreo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String> ();
		
		map.put("1", "브루노 마스");
		map.put("2", "테일러 스위프트");
		map.put("3", "위어드 알 얀코빅");
		
		System.out.println(map.size());
		
		map.remove("2");
		
		System.out.println(map);
		
		Map<String, Integer> person = new HashMap<String,Integer> ();
		
		person.put("a", 69);
		person.put("b", 42);
		person.put("c", 7);
		person.put("d", 13);
		
		Set<String> set = person.keySet();
		System.out.println(set);
		
		Collection<Integer> values = person.values();
		System.out.println(person.values());
		
		Iterator<Integer> iter = values.iterator();
		int i = 0;
		while(iter.hasNext()) {
			i += iter.next();
		}
		System.out.println(i);
		System.out.println(Collections.max(values));
		System.out.println(Collections.min(values));
	}
}
