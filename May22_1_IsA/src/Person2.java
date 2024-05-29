
public class Person2 extends Human{
String a;

public Person2() {
	// TODO Auto-generated constructor stub
}

public Person2(String name, int age, String job, String grade, String a) {
	super(name, age, job, grade);
	this.a = a;
}

public void printInfo() {
	super.printInfo();
}
}
