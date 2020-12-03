package com.yedam.functional1203;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	static int[] scores = { 92, 95, 87, 87 };

	static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for (int number : scores) {
			result = oper.applyAsInt(result, number);
		}
		return result;
	}

	public static void main(String[] args) {
		int maxValue = maxOrMin(new IntBinaryOperator() { // 대문자 IBO 치고 컨트롤 스페이스 누르면 IntBinaryOperator누를수 있는 창 뜬다

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + "  right: " + right); // 출려되는 과정 알고 싶어서 적어봄
				return left > right ? left : right; // left 값이 right값보다 크면 left값 출력하고 아니면 right값 출력해주세요
			}
		});
		System.out.println("제일 큰 값: " + maxValue);

		int minValue = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + "  right: " + right); // 출려되는 과정 알고 싶어서 적어봄
				return left < right ? left : right; // left 값이 right값보다 크면 left값 출력하고 아니면 right값 출력해주세요
			}

		});
		System.out.println("제일 작은 값: " + minValue);
	}

}
