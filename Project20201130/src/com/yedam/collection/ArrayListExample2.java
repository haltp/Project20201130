package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".length());
		System.out.println("Hello".length());
		System.out.println("=====================================");
		
		List<String> list = new ArrayList<>();
		list.add(new String("Hello"));
		list.add(new String("World"));
		list.add("Welcome");
		list.add(new String("Hello"));

//		list.get(1); //두번째 값 가져오기

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String str : list) {
			System.out.println(str);
		}

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello"); // 중복된 값은 담아지지 않는다, 헬로우 월드 두개만 나온다

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println("=====================================");
		Set<Fruit> fruits = new HashSet<>(); // Fruit클래스
		fruits.add(new Fruit("Apple", 1000));
		fruits.add(new Fruit("Banana", 1500));
		fruits.add(new Fruit("Orange", 1500));
		fruits.add(new Fruit("Bpple", 1000));
		System.out.println("=====================================");
	
		
		Iterator<Fruit>fiter = fruits.iterator();
		while(fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName()+"-"+fruit.getPrice());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
