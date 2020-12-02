package com.yedam.ingerface;

interface Runnable {
	public void run();
}

class AutoRun implements Runnable {

	@Override
	public void run() {
		System.out.println("자동실행.");
	}
}

class NewRun implements Runnable {
	@Override
	public void run() {
		System.out.println("새로운 실행.");
	}
}

public class InterfaceExample1202 {
	public static void main(String[] args) {
		Runnable runnable = new AutoRun();
		runnable.run();
		runnable = new NewRun();
		runnable.run();

		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("익명실행.");
			}

		};
		runnable.run();

		runnable = () -> System.out.println("또다른 익명 실행."); //람다 표현식
		
		runnable.run();
	}

}
