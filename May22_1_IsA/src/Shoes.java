
public class Shoes extends stuff{
int size;

public Shoes() {
	// TODO Auto-generated constructor stub
}



public Shoes(String name, int price, int size) {
	super(name, price);
	this.size = size;
}



public void printInfo() {
	super.printInfo();
	System.out.println(size);
}

}
