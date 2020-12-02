package com.yedam.ingerface;

interface MyFuntionalInterface {
	public void run(int radius);
}

public class InterfaceExample3 {
	public static void main(String[] args) {

		// 1.화면 출력(원의 넓이 구하는 기능 구현)
		MyFuntionalInterface myfu = (radius) -> {
			double result = radius * radius * 3.14;
			System.out.println(result);
		};
		myfu.run(3);

		// 2.화면출력(밑변으로 가지는 삼각형의 넓이 구하는 기능)
		myfu = (radius) -> {
		double result = radius * 3 * 0.5;
		System.out.println(result);
		};
		myfu.run(3);
		
		// 3.화면출력(정사각형의 넓이를 구하는 기능 구현)
		myfu = (radius) -> {
		double result = radius * radius;
		System.out.println(result);
		};
		myfu.run(3);
	}
}

