// A is a B : 상속관계
// 쇼핑몰 - '상품'에 대한 정보를 게시하고 싶음
public class IMain2 {
	public static void main(String[] args) {
		// 신발 (이름, 가격, 사이즈)
		// 출력
		Shoes shoes = new Shoes("신발", 2000, 250);
		shoes.printInfo();
		System.out.println("----------------");
		// 컴퓨터 (이름, 가격, cpu, ram, hdd)
		// 출력
		Computer c = new Computer("c", 10, "a", "b", "c");
		c.printInfo();
		System.out.println("----------------");
		
		// 노트북(이름, 가격, cpu, ram, hdd, 무게, 배터리 지속시간)
		// 출력
		Laptop l = new Laptop("d", 10, "e", "f", "g", 30, 40);
		l.printInfo();
		System.out.println("----------------");
		
	}

}
