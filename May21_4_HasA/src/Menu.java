
public class Menu {
	String name;
	int price;
    Restaurant whereToSell;
    
    public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price, Restaurant whereToSell) {
		super();
		this.name = name;
		this.price = price;
		this.whereToSell = whereToSell;
	}
    
    public void printInfo() {
    	System.out.println("메뉴 이름 : "+name);
    	System.out.println("가격 : "+price);
    	whereToSell.printInfo();
    }
    

}
