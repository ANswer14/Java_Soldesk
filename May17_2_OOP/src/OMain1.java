// Coder : 개발자
// Programmer : Coder + 설계 ***

// OOD (Object Oriented Design) - 객체 지향 디자인
//  실생활을 디자인
public class OMain1 {
	public static void main(String[] args) {
		// 의사 (이름, 나이)
		Doctor d1 = new Doctor();
		d1.name = "으이사";
		d1.age = 50;
//		d1.printInfo();
		
		
		// 손님 (이름, 나이)

		Customer c1 = new Customer();
		c1.name = "소온님";
		c1.age = 25;
//		c1.printInfo();
		
		
		
		
		
		d1.start(c1);
		
		
	}

}
