package com.LYH.may222.main;

import com.LYH.may222.product.Computer;
import com.LYH.may222.product.Product;
import com.LYH.may222.product.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		// 매직스테이션, 800000원, i5-1234, 8GB, 500GB 컴퓨터
		// 출력
		Computer c = new Computer("매직스테이션", 800000, "i5-1234", "8GB", "500GB");
		c.printInfo();
		System.out.println("----------------------");

		// 멀티익스프레스, 500000원 스캐너
		// 출력
		com.LYH.may222.product.Scanner s = new com.LYH.may222.product.Scanner("멀티익스프레스", 500000);
		s.printInfo();

//		Scanner Scanner = new Scanner("멀티익스프레스", 500000);
//		Scanner.printInfo();
//		System.out.println("----------------------");
	}
}
