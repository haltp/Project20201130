package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Hong", 15);
		map.put("Hwang", 20);
		map.put("Hong", 25);
		
		Integer val = map.get("Hong");
		System.out.println(val);
		
		Set<String> re = map.keySet();
		for(String nu: re) {
			System.out.println("key: "+nu+", val: "+map.get(nu));
		}
		System.out.println("==========================================");
		Set<Entry<String, Integer>>entry = map.entrySet();
		for(Entry<String, Integer> entr: entry) {
			System.out.println("key: "+entr.getKey()+", val: "+entr.getValue());
		}
		
		System.out.println("==========================================");
		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "이나경");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "김다현");
		
		String result = mapInt.get(10);
		System.out.println(result);
		
		Set<Integer>set = mapInt.keySet();
		for(Integer num: set) {
			System.out.println("key: " +num+", val: "+mapInt.get(num));
		}
		System.out.println("==========================================");
		Set<Entry<Integer, String>>entrySet = mapInt.entrySet();
		for(Entry<Integer, String> ent :entrySet) {
			System.out.println("key: "+ent.getKey()+", val: "+ent.getValue());
		}
			
	}
	
}
