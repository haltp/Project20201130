package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample09_1201 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> set = map.keySet();
		for(String str: set) {
			totalScore += map.get(str);
			if(map.get(str)>maxScore) {
				maxScore = map.get(str);
				name = maxScore;
			}
			
			}
		System.out.println("평균점수: "+ totalScore/map.size());
		System.out.println("최고점수: "+ maxScore);
		System.out.println("최고점수를 받은 아이디: "+ name);
	}
}
