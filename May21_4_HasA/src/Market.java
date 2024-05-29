
public class Market {
	String name;
	String location;
	Plate whatToBuy;
	
	public Market() {
		// TODO Auto-generated constructor stub
	}

	public Market(String name, String location, Plate whatToBuy) {
		super();
		this.name = name;
		this.location = location;
		this.whatToBuy = whatToBuy;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("위치 : "+ location);
		whatToBuy.printInfo();
	}

}
