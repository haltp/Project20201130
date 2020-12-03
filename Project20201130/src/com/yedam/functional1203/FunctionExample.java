package com.yedam.functional1203;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
	public static List<Student> list = Arrays.asList(new Student("Hong", 90, 96), new Student("Hwang", 95, 93));
			
	public static void printString(Function<Student, String> func) {
		for(Student student : list) {
			System.out.println(func.apply(student));
		}
	}
	
	public static void printInt(ToIntFunction<Student> func) {
//						   	(Function<Student, Integer> func) { 로 쓸 수 있다
		for(Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	
	}
	//평균 구하기
	public static double avg(ToDoubleFunction<Student> func) {
		double result = 0, sum = 0;
		for(Student student: list) {
			result = func.applyAsDouble(student);
			sum+=result;
		}
		return sum/list.size();
	}
			
	public static void main(String[] args) {
		System.out.println("[영어평균]");
		double avg = avg(new ToDoubleFunction<Student>( ) {

			@Override
			public double applyAsDouble(Student value) {
				return value.getEngScore(); //int -> double
			}
			
		});
		System.out.println("result: "+avg);
		
		System.out.println("====================");
		BiFunction<String, String, Integer> biFunc = null; //두개 입력 하나 리턴(출력)
		
		System.out.println("[합계점수]");
		printInt(v -> v.getEngScore()+v.getMathScore());	
		
		System.out.println("[영어점수]");
		printInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		});
		
		System.out.println("[학생이름-수학점수]");
		printString(t -> t.getName()+"-"+t.getMathScore());
		
		
		
		
		
		System.out.println("===============================");
		Function<String, Integer> func = null; //하나 입력 하나 리턴(출력)
		func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}
			
		};
		System.out.println(func.apply("Hello"));
		System.out.println(func.apply("HelloWorld"));
		
		
	}
}
