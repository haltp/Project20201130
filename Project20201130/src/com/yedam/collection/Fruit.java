package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;
	public Fruit() {
		
	}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public boolean equals(Object obj) { //동일한 객체 중복제거할때 이퀄, 해시코드 두가지 써라
//		return super.equals(obj);
//		Object obj => Fruit 클래스로 Casting
		Fruit fruit = (Fruit) obj;
		boolean b1 = this.name.length() == fruit.name.length();
		boolean b2 = this.price == fruit.price;
		return b1 && b2;
//		return this.name.equals(fruit.name) && this.price == fruit.price;
	}
	@Override
	public int hashCode() {
		return this.name.length() + this.price;
	}
	
	
}
