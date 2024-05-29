// 아무 상속도 받고 있지 않으면 extend Object
// Product is a Object (자바 객체)
public class stuff2 /* extends Object */ {
	String name;
	int price;

	public stuff2() {
		System.out.println("Stuff !");
	}

	public stuff2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);

	}
}
