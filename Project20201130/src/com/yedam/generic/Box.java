package com.yedam.generic;

//public class Box {	

//	Object	obj;	//Object는 최상위 클래스, 어떤 유형이라도 담을 수 있다.
//	void set(Object	obj)	{
//		this.obj = obj;
//	}
//	Object	get() {
//		return obj;
//	}
//}

//------------------------------


public class Box<T> {// <T>메인메소드실행할때 타입을 정하겠다는 의미
	T obj; // Object는 최상위 클래스, 어떤 유형이라도 담을 수 있다.

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

}
