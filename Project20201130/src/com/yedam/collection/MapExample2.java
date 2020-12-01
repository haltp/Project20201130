package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(101, "윤태현"), 80);
		map.put(new Student(102, "정병기"), 90);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 80);
		map.put(new Student(103, "정병기"), 88);

		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println("학번: " + student.getStudentNo() + "  이름: " + student.getStudentName() + "  점수: "
					+ map.get(student));
		}

		Set<Student> sett = map.keySet();
		int sum = 0;
		for (Student student : sett) {
			sum += map.get(student);
		}
		System.out.println("평균: " + (sum / map.size()));
		System.out.println("==========================================");

		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		int sum1 = 0;
		for (Entry<Student, Integer> ent : entrySet) {
			sum1 += ent.getValue();
		}
		System.out.println("평균: " + sum1/map.size());
	}
}
