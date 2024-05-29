

public class Plate {
	String name;
	int price;
	Menu somethingThatIHave;
	
	public Plate() {
		// TODO Auto-generated constructor stub
	}

	public Plate(String name, int price, Menu somethingThatIHave) {
		super();
		this.name = name;
		this.price = price;
		this.somethingThatIHave = somethingThatIHave;
	}
	
	public void printInfo() {
		System.out.println("이름 : " +name);
		System.out.println("가격 : "+price);
	}

}
