package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice"); //1번째 위치에 Nice 넣겠다, 헬로우 나이스 월드 웰컴 나온다
		System.out.println("size: "+ list.size());
		list.add(list.size(), "last"); //size: 갯수 4개, 마지막에 last 넣겠다
		
		
//		list.remove(1); //1위치의 값을 지우겠다, world 지워짐
//		for(String str :list) {
//			System.out.println(str);
//		}
		
		list.remove(1);
		for(int i =0; i<list.size(); i++) {
			System.out.println("index:" +i+","+list.get(i));
		}
		
		List<Integer> listNum = new ArrayList<>();
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);
		
		int sum = 0;
		for(Integer num : listNum) {
			sum+=num;
			
		}
		System.out.println("listNum합계: "+sum); //100+200+300
	}
}
