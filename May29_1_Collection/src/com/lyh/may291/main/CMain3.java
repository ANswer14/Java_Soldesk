package com.lyh.may291.main;

import java.util.HashMap;
import java.util.Scanner;

import com.lyh.may291.student.Student;

public class CMain3 {
	public static void main(String[] args) {
		// 학생의 이름을 입력했을 때
		// 그 학생의 전체 정보를 출력하고 싶음
		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("수수수", new Student("수수수", 100, 100, 100));
		hm.put("우우우", new Student("우우우", 80, 80, 80));
		hm.put("미미미", new Student("미미미", 50, 50, 50));
		hm.put("양양양", new Student("양양양", 30, 30, 30));
		Scanner k = new Scanner(System.in);
		System.out.print("학생 이름 : ");
		String name = k.next();
		hm.get(name).printInfo();
	}
}
