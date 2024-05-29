
public class Computer extends stuff{
String cpu;
String ram;
String hdd;

public Computer() {
	// TODO Auto-generated constructor stub
}


public Computer(String name, int price, String cpu, String ram, String hdd) {
	super(name, price);
	this.cpu = cpu;
	this.ram = ram;
	this.hdd = hdd;
}


public void printInfo() {
	super.printInfo();
	System.out.println(cpu);
	System.out.println(ram);
	System.out.println(hdd);
}
}
