
public class Restaurant {
	String name;
	String location;
	String phoneNumber;
	Person1 ceo;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String location, String phoneNumber, Person1 ceo) {
		super();
		this.name = name;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.ceo = ceo;
	}
	
	public void printInfo() {
		System.out.println("가게 이름 : "+name);
		System.out.println("가게 위치 : "+location);
		System.out.println("연락처 : "+phoneNumber);
		ceo.printInfo();
	}
	
}
