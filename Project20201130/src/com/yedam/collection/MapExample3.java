package com.yedam.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample3 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(101, "Hong", "Hong", 1000));
		set.add(new Employee(101, "Hwang", "HWANG", 2000));
		set.add(new Employee(101, "park", "PARK", 3000));
		set.add(new Employee(101, "choi", "CHOI", 3500));

		Map<Integer, String> map = new HashMap<>();
		for (Employee emp : set) {
			map.put(emp.getEmployeeId(), emp.getLastName());

		}
	}
}