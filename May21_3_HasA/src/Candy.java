// Candy has a Company : 제조사
// Company has a Candy : 제품
public class Candy {
String name = "청포도";
String taste = "청포도";
Enterprise brand;

public Candy() {
	// TODO Auto-generated constructor stub
}

public Candy(String name, String taste) {
	super();
	this.name = name;
	this.taste = taste;
}

public void printInfo() {
	System.out.printf("이름 : %s\n", name);
	System.out.printf("맛 : %s\n",taste);
}

}