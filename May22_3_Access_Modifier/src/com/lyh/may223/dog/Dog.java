package com.lyh.may223.dog;

import com.lyh.may223.main.AMain1;

// 접근제어자 (Access Modifier)
//     멤버변수 or 클래스에서 사용
//     외부에서 (멤버변수나 클래스에) 접근하지 못하도록 제한하는 역할
public class Dog {
	 								// <접근 가능 범위>
	public int a; 					// 접근 제한 없음
	protected int b;				// 같은 패키지 내 or 
									// 다른 패키지라면
									// 하위 클래스의 객체를 통해서 접근이 가능 O
	/*default */ int c;				// 객체가 같은 패키지 내
									// *default : 아무것도 쓰지 않은...
	private int d;					// 객체가 같은 클래스 내부에서만 O / 외부에서는 접근 X
	
	
	
	public static void main(String[] args) {
		
	AMain1 q = new AMain1();
	q.a = 1;   // 같은클래스 다른객체
//	q.b = 1;   // 
//	q.c = 1;
	
	Dog f = new Dog();
	f.a = 0;
	f.b = 0;
	f.c = 0;
	f.d = 0;
}
}