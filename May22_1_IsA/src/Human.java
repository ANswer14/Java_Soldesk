
public class Human {
String name;
int age;
String whereToWork;
String grade;

public Human() {
	// TODO Auto-generated constructor stub
}

public Human(String name, int age, String job, String grade) {
	super();
	this.name = name;
	this.age = age;
	this.whereToWork = job;
	this.grade = grade;
}

public void printInfo() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(whereToWork);
	System.out.println(grade);
}
}
