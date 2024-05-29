// 생성자 (Constructor)
//    객체가 만들어질때 뭔가 작업을 해야하는데...
//    => 생성자 만들기!
//    리턴이 아예 없고, 메소드명이 클래스명과 같은 메소드
//    생성자를 만들지 않으면
//       => 자바 컴파일러가 기본 생성자를 만들어버림
//    생성자를 건드리면...
//       => 자바 컴파일러가 기본 생성자를 안만들어줌
//       => 시스템이 자동으로 객체를 만들때가 있는데...
//           => 기본 생성자를 씀! => 에러!


public class Shoe {
	String name;
	int size;
	int price;
  static final String BRAND = "나이키";
	
  // 기본 생성자 (Ctrl + Space)
  public Shoe() {
	// TODO Auto-generated constructor stub
  }
  
  // 생성자 오버로딩 (Ctrl + Shift + Space)
  public Shoe(String name, int size, int price) {
	  super(); // Java 최상위 객체인Object의 생성자를 불러옴
//	  name = name; // 파라미터명 = 파라미터명 => 멤버변수에 접근이 안됨
	  this.name = name;
	  this.size = size;
	  this.price = price;
  }

	public void printInfo() {
		System.out.printf("이름 : %s\n", name);
		System.out.printf("발 사이즈 : %d\n", size);
		System.out.printf("가격 : %,d원\n", price);
		System.out.printf("브랜드 : %s\n", BRAND);
	}
	
	public void test(String name) {
		// 멤버변수명 / 파라미터명 같다면 ?
		//    this. 붙이게 되면 무조건 멤버변수
		//    안붙이면 가장 가까이 있는것
		System.out.println(name);
		System.out.println(this.name);
	}
	
	
	

}
