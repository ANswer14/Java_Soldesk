package com.lyh.may241.calculator;

import java.util.Scanner;

public class Calculator {
	// 1. 여기서 아예 끝장을 보자! : try - catch - finally
	// 정상 : 13 - 14 -  19 - 20 - 15 - 호출
	// 무게값으로 0 : 13 - 14 - 16 - 17 - 19 - 20 - 18 -호출
	
	
	public static int calc(int price, int mass) {
		Scanner k = new Scanner(System.in);
		try {
			int d = price / mass;
			return d;
		} catch (ArithmeticException e) {
			System.out.println("질량이 0이 될순 없습니다.");
			return -9999;
		} finally {
			System.out.println("zzzzzzzzz");
		}
	}
	// 2. 미루기 : throws => try보다 더 주력
	//	calc2를 실행하다가 Exception이 터지면
	//	calc2를 호출한 쪽에서 해결해라!!
	public static int calc2(int price, int mass) throws Exception{
		int d = price / mass;
		return d;
	}
}



















