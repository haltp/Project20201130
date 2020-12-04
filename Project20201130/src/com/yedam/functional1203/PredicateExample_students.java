package com.yedam.functional1203;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample_students {
	private static List<Students> list = Arrays.asList(// //이렇게 해놓으면 컨트롤 쉬프트 f정렬해도 한줄로 안바뀐다
			new Students("홍길동", "남자", 90), //
			new Students("김순희", "여자", 90), //
			new Students("감자바", "남자", 95), //
			new Students("박한나", "여자", 92));//

	public static double avg(Predicate<Students> predicate) {
		int count = 0, sum = 0;
		for (Students students : list) {
			if (predicate.test(students)) {
				
				count++;
				sum += students.getScore();
			}
		}

		return (double) sum / count;

	}

	public static void main(String[] args) {
		double maleAvg = avg(new Predicate<Students>() {

			@Override
			public boolean test(Students t) {
				System.out.println(t.getName() + "," + t.getScore());
				return t.getSex().equals("남자");
			}

		});
		System.out.println("남자 평균 점수: " + maleAvg);

		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
	}

}
