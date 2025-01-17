package com.lyh.may225.main;

import com.lyh.may225.avengers.Avengers;
import com.lyh.may225.avengers.Ironman;

// 다형성 (Polymorphism)
// Poly (많은) + Morph (모양)
// 상위타입 변수에 하위타입 객체를 담는 것이 가능
// 같은 형태이지만 다른 기능을 할 수 있음! (override와 밀접한 관련)
public class AMain3 {
	public static void main(String[] args) {
		// 아이언맨 담는 그릇 i에 아이언맨 만들어 넣음
		Ironman i = new Ironman("A", 345, 345345);
		
		// 어벤져스 담는 그릇 a에 아이언맨 만들어 넣음
		Avengers a = new Ironman("B", 456, 456456);
		// 다형성을 통해서 코드의 유연성과 확장성이 증가
		
		a.attack();
		// a는 Avengers 타입인데, 실제로는 Ironman 객체를 참조하고 있음
		// Ironman 클래스에서 오버라이딩 된 attack() 메소드를 호출했는데
		// 이 결과가 다형성과 오버라이딩이 밀접한 관련이 있음
	}
}










































