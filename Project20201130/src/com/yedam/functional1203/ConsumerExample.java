package com.yedam.functional1203;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
//		Consumer<String> consumer = null;
//		consumer = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//			
//		};
		//람다식으로 줄이기
		Consumer<String> consumer = null;
		
		consumer = t -> System.out.println(t);
		
		consumer.accept("Hello");
		
		System.out.println("===================");
		
		
		consumer = t -> System.out.println("Hello "+ t);
		
		consumer.accept("Hong");
		consumer.accept("Hwang");
		
		System.out.println("===================");
		
		
		BiConsumer<String, Integer> biCon = null;
		biCon = (t, u) -> System.out.println("이름은 "+t+", 나이는 "+u);
	
		biCon.accept("Hong", 15);
		
		System.out.println("===================");
		
		ObjIntConsumer<String> objIntCon = null;
		objIntCon = (t, v) -> System.out.println("이름은 "+t+", 점수는 "+v);
		
		objIntCon.accept("Kim", 100);
		
		
		
		
		
		
		
		
		
	}
}
