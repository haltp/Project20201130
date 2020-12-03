package com.yedam.interfaces;

//함수적 인터페이스	Functional Interface
interface MyFuntionalInterface {
	public void run(int radius);
}

public class InterfaceExample3 {
	public static void main(String[] args) {

		// 1.화면 출력(원의 넓이 구하는 기능 구현)
		MyFuntionalInterface myfu = (r) -> {
			double result = r * r * Math.PI;
			System.out.println("원의 넓이: "+result);
		};
		myfu.run(5);

		// 2.화면출력(밑변으로 가지는 정삼각형의 넓이 구하는 기능)
		myfu = (l) -> {
		double result = l * 3 * 0.5;
		System.out.println("삼각형 넓이: "+result);
		};
		myfu.run(3);
		
		// 3.화면출력(정사각형의 넓이를 구하는 기능 구현)
		myfu = (l) -> {
		double result = l * l;
		System.out.println("정사각형 넓이: "+result);
		};
		myfu.run(3);
	}
}

