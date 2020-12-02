package com.yedam.ingerface;

//함수적 인터페이스(Functional Interface)
interface Cal {
	public void multi(int num);
//	public void sum(); 메소드가 두개면 불가능, 무조건 메소드가 하나여야 람다 표현식 가능하다
}

//interface Calculate {
//	public void sum(int num1, int num2);
//}

public class InterfaceExample2 { // 람다표현식
	public static void main(String[] args) {
//		Calculate calcu = (int num1, int num2) -> {
//			System.out.println(num1 + num2);
//
//		};
//		calcu.sum(3, 5);
//		calcu = (a, b) -> {
//			System.out.println(a * b);
//		};

		Cal cal = (num) -> {
			int result = num * 2;
			System.out.println(result);
		};
		cal.multi(3);

		cal = (a) -> {
			int result = a * a;
			System.out.println(result);
		};
		cal.multi(2);
	}
}
