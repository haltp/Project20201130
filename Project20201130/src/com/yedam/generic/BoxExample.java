package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple {

}

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("Hello");
//		String str = (String) box.get(); // Object타입을 String으로 형변환
//
//		box.set(new Integer(10));
//		Integer num1 = (Integer) box.get(); // Object타입을 Integer으로 형변환
//
//		box.set(new Apple()); // Object선언했기때문에 어떤유형이던 가능
//		str = (String) box.get();
//
//		System.out.println("end");
		
//------------------------------------
		
		Box<String> box = new Box<String>();
		String str = box.get();
		
		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get();
		System.out.println("end");
		
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		
		List<Apple> applist = new ArrayList<>();
		applist.add(new Apple());

	}
}
