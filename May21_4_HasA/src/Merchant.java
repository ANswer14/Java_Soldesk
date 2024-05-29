
public class Merchant {
	String name;
	Market marketHeLikes;
	
	public Merchant() {
		// TODO Auto-generated constructor stub
	}

	public Merchant(String name, Market marketHeLikes) {
		super();
		this.name = name;
		this.marketHeLikes = marketHeLikes;
	}
	
	public void printInfoMarket() {
		System.out.println("이름 : "+ name);
		marketHeLikes.printInfo();
	}
	
}
