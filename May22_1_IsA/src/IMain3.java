
public class IMain3 {
	public static void main(String[] args) {
		// 홍길동, 17살, 논현고등학교, 1학년 => 출력
		Person1 person1 = new Person1("홍길동", 17, "논현고등학교", "1학년", null);
		person1.printInfo();
		System.out.println("-----------------------");
		// 김길동, 21살, 서울대학교, 2학년 => 출력
		Person2 person2 = new Person2("김길동", 21, "서울대학교", "2학년", null);
		person2.printInfo();
		System.out.println("-----------------------");
		// 고길동, 22살, 육군, 상병      => 출력
		Person3 person3 = new Person3("고길동", 22, "육군", "상병", null);
		person3.printInfo();
		System.out.println("-----------------------");
		
		
		Pen p = new Pen();
		System.out.println("-----------------------");
		Pen p2 = new Pen("빨강");
		System.out.println("-----------------------");
		Pen p3 = new Pen("모나미", 300, "검정");
		System.out.println("-----------------------");
		
		// 이름이 패션마스크, 가격이 1000원인 마스크
		Mask m = new Mask("패션마스크", 1000);
	
	
		
	}

}
