package com.lyh.may242.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// 학생의 ( 이름 / 생년월일(yyyy.MM.dd)/국어/수학/영어 ) 를 입력받아서
	// 학생의 나이, 총점, 평균점수 값을 출력
	// split => Stringtokenizer
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("정보(이름/생년월일(yyyy.MM.dd)/국어점수/수학점수/영어점수) 입력 : ");
		String info = k.next();
		int a = 0;
		int age = 0;
		int sumScore = 0;
		double stdScore = 0;
		int kor = 0;
		int math = 0;
		int eng = 0;
		try {
			
			String[] ar = info.split("/");
			System.out.println(ar[1]);
			String[] year = ar[1].split("\\.");
			a = Integer.parseInt(year[0]);
			age = 2024 - a;
			kor = Integer.parseInt(ar[2]);
			math = Integer.parseInt(ar[3]);
			eng = Integer.parseInt(ar[4]);
			sumScore = kor + math + eng;
			stdScore = (double)sumScore / 3;
			System.out.printf("나이 : %d\n총합 : %d\n평균 : %.2f\n",age , sumScore , stdScore);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	public static void main(String[] args) {
//		Scanner k = new Scanner(System.in);
//		System.out.print("이름/생년월일(yyyy.MM.dd)/국어/수학/영어 : ");
//		String s = k.next();
////		System.out.println(s);
//		
//		String[] sData = s.split("/");
//		// 이름
//		String name = sData[0];
//		System.out.println("이름 : "+ name);
//		
//		try {
//			// 생일(나이)
//			String bd = sData[1];
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//			Date birthday = sdf.parse(bd);
//			
//			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd E");
//			String birthdayStr = sdf2.format(birthday);
//			System.out.printf("생일 : %s\n", birthdayStr);
//			
//			Date now = new Date();
//			SimpleDateFormat yrFmt = new SimpleDateFormat("yyyy");
//			String nowYr = yrFmt.format(now);
//			String birthdayYr = yrFmt.format(birthday);
//			
//			int ny = Integer.parseInt(nowYr);
//			int by = Integer.parseInt(birthdayYr);
//			int age = ny - by;
//			System.out.printf("나이 : %d살\n" ,age);
//			System.out.printf("나이 : %d살\n" ,now.getYear() - birthday.getYear());
//			
//			int kor = Integer.parseInt(sData[2]);
//			int math = Integer.parseInt(sData[3]);
//			int eng = Integer.parseInt(sData[4]);
//			
//			System.out.printf("국어 : %d점\n", kor);
//			System.out.printf("수학 : %d점\n", math);
//			System.out.printf("영어 : %d점\n", eng);
//			
//			int sum = kor + math + eng ;
//			System.out.printf("총점 : %d점\n", sum);
//			
//			double avg = (double) sum / 3;
//			System.out.printf("평균 : %.2f점\n", avg);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
	
	
	
	
	
}
