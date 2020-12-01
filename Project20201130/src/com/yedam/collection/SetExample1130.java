package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample1130 {
	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);
		numbers.add(40);
		numbers.add(20);
		numbers.add(25);

		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		
		numbers.remove(20);
		numbers.remove(25);

		int sum1 = 0;
		for (Integer i : numbers) {
			sum1 += i;
		}
		System.out.println("중복제외합계: " + sum1);
	}

}
