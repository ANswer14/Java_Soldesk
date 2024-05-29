// Java : Perfect 객체지향언어 (구조가)
// C++, Python : Hybrid 객체지향언어 (구조가)

// 실생활을 묘사하자 => 보기가 쉬워질 것  => 유지보수에 용이해짐 !

// main()있는 클래스 : XXXMain     으로 지을것

// Class : 객체를 찍어내는 틀 (ex: 붕어빵 틀, 도장)

// 멤버변수 (Member Variable) - 속성 ( = attribute, field, 전역변수 )
//	                        - 객체의 데이터가 저장되는 공간
public class OMain2 {
	public static void main(String[] args) {
		// 버스를 Java로 표현해보자
		//  => 표현하고 싶을 때는 항상! 클래스를! 새로! 만들자!
		// 버스번호 / 차종 / 버스회사 / 기사님이름 / 시작점 => 출력
		// int, double, String, ... : ?!, Java를 모르는 사람한테 설명하기 어렵다
		// 주석을 달 필요가 없다는게 장점! => 뭘 표현하고자 하는지 알 수 있기 때문에!
		// b : 객체, instance 라고 부름
		
		Bus b = new Bus();
		b.num = 6;
		b.carSort = "HA";
		b.enterprise = "AAA";
		b.handlerName = "아무개";
		b.startingLocation = "신논현역";
		
		
//		System.out.println(b.num);
//		System.out.println(b.carSort);
//		System.out.println(b.enterprise);
//		System.out.println(b.handlerName);
//		System.out.println(b.startingLocation);
//		System.out.println("===================");
		b.printInfo();
		b.go();
		System.out.println("===================");
		// 핸드폰
		//       모델명
		//       제조사
		//       가격
		//       정보를 출력
		//       전화가 왔을 때 - 벨소리 출력
		
		Phone p1 = new Phone();
		System.out.println(p1);
		p1.printInfo();
		p1.bellSound();
		System.out.println("===================");
		// p1과 똑같은 속성값을 가진 p2 생성 - 불가능!!! (52번줄의 방법으로는)
		//  => 무조건 new ~~ 로 생성해야 !!!!(*결론)
		Phone p2 = p1;  // p1의 별명이 하나 더 추가된 상황!
		System.out.println(p2); // 번지값이 같다.
		                        // 핸드폰 하나를 2명이 공유하고있는 상황!
		p2.price = 850000;
		p2.printInfo();
		System.out.println("===================");
		p1.printInfo();// 위에서 p2가격을 850000으로 변경 => p2 = p1이라 공유
		System.out.println("===================");
		
	}

}
