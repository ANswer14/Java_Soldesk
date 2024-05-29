package com.lyh.may291.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.lyh.may291.student.Student;

public class CMain2 {
	public static void main(String[] args) {
		// 학생 객체 - 이름 / 국어 / 영어 / 수학 + 속성들 출력 기능
		
		// 학생의 번호를 입력하면 => 그 학생의 정보를 출력할건데
		// 이 때 어떤걸 써야 할까요 ?
		// 학생 4명 생성
		// < 내 방법 > 
//		Student s1 = new Student("수수수", 100, 100, 100);
//		Student s2 = new Student("우우우", 80, 80, 80);
//		Student s3 = new Student("미미미", 50, 50, 50);
//		Student s4 = new Student("양양양", 30, 30, 30);
//		
//		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
//		hm.put(1, s1);
//		hm.put(2, s2);
//		hm.put(3, s3);
//		hm.put(4, s4);
//		Scanner k = new Scanner(System.in);
//		System.out.print("학생 번호 : ");
//		int number = k.nextInt();
//		hm.get(number).printInfo();
		// < 강사님 방법 > 
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("ㅋㅋ", 30, 20, 10));
		students.add(new Student("ㅎㅎ", 70, 50, 40));
		students.add(new Student("ㅇㅇ", 80, 90, 20));
		students.add(new Student("ㅁㅁ", 50, 100, 60));
		
		Scanner k = new Scanner(System.in);
		System.out.print("학생 번호 : ");
		int number = k.nextInt();
		
		// 해당 번호 학생의 전체 정보가 출력되게
		students.get(number - 1).printInfo();
		
		
	}
}
