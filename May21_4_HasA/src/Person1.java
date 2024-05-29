
public class Person1 {
	String name;
	String sex;
	String phoneNumber;
//	KangnamPocha building;
//	EggMari menu1;
//	GrilledBulgogi menu2;
	
	public Person1() {
		// TODO Auto-generated constructor stub
	}
public Person1(String name, String sex, String phoneNumber) {
	super();
	this.name = name;
	this.sex = sex;
	this.phoneNumber = phoneNumber;
}
	
	public void printInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("성별 : "+sex);
		System.out.printf("핸드폰 번호 : %s \n", phoneNumber);
	}
}
