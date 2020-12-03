package com.yedam.interfaces;

public class InterfaceExample4 {
	public static void main(String[] args) {
		MyInterface mi = null;
		// 매개값의 합
		mi = (a, b) -> a + b;

		int result = mi.run(10, 20);

		mi = (num1, num2) -> num1 * num2;
		result = mi.run(5, 10);

		// 두개의 변수(직사각형의 가로, 세로 ->넓이 구하는 기능 구현
		mi = (a, b) -> a * b;
		result = mi.run(2, 3);

		System.out.println("결과값: " + result);
	}
}

//람다식 줄이기 전
//	MyInterface mi = null;
//	mi = new MyInterface() {
//		@Override
//		public int run(int num1, int num2) {
//		return num1*num2;
//		}	
//	};