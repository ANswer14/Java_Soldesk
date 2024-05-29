
public class CMain1 {
	public static void main(String[] args) {
		// 신발
		// 나이키 홈페이지

		// 이름 : ???
		// 사이즈 : 260
		// 가격 : ???
		// 브랜드 : 나이키
		// 정보 출력

		Shoe s1 = new Shoe();
		s1.name = "나이키 덩크 로우 레트로";
		s1.size = 245;
		s1.price = 139900;
		s1.printInfo();
		System.out.println("--------------------");

		Shoe s2 = new Shoe();
		s2.name = "나이키 줌 보메로 5";
		s2.size = 245;
		s2.price = 189900;
		s2.printInfo();
		System.out.println("--------------------");
		
		// 생성자 오버로딩
		Shoe s3 = new Shoe("신발", 250, 30000);
		s3.printInfo();
		System.out.println("--------------------");
		s2.test(s2.name);
		System.out.println("--------------------");
		s2.test("zzz");
		System.out.println("--------------------");
		
		// 커피
		// 커피 이름 / 가격
		
		// 출력
		Coffee c = new Coffee("아메리카노", 2500);
		c.printInfo();
	}

}
