
public class Person3 extends Human{
String a;
public Person3() {
	// TODO Auto-generated constructor stub
}
public Person3(String name, int age, String job, String grade, String a) {
	super(name, age, job, grade);
	this.a = a;
}

public void printInfo() {
	super.printInfo();
}
}
