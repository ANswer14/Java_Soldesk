package com.LYH.may222.main;

import java.util.Random;
import java.util.Scanner;

import com.LYH.may222.product.Computer;

// 패키지 : 클래스명이 중복될 때 구별 할 수 있는 수단!
//        모든 클래스는 패키지에 넣을 수 있도록

// 패키지명이 중복? 똑같으면? => 방법이 없음
//    => 전 세계적으로 패키지명이 중복 안되게
// ex) com.회사명.프로그램명.카테고리 (소문자!)
//     kr.co.회사명.프로그램명.카테고리

// 객체
//    패키지명.클래스명 변수명 = new 패키지명.생성자 호출();
public class PMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		com.LYH.may222.product.Scanner a = new com.LYH.may222.product.Scanner();

		// 객체 만들 때 패키지명을 생략 가능한 경우
		// - 자바 기본 패키지(java.lang) 소속
		/* java.lang. */String s = "z";
		/* java.lang. */System.out.println("A");

		// 같은 패키지 소속
		com.LYH.may222.main.Lasdf l = new com.LYH.may222.main.Lasdf();
		Lasdf l2 = new Lasdf();

		// 다른 패키지 소속
		Computer c2 = new Computer();

		// ctrl + shift + o를 활용해서 : import 정리!
		Random r2 = new Random();

	}

}
