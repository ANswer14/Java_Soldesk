
public class Laptop extends Computer{
double mass;
double batteryDuration;

public Laptop() {
	// TODO Auto-generated constructor stub
}




public Laptop(String name, int price, String cpu, String ram, String hdd, double mass, double batteryDuration) {
	super(name, price, cpu, ram, hdd);
	this.mass = mass;
	this.batteryDuration = batteryDuration;
}




public void printInfo() {
	super.printInfo();
	System.out.println(mass);
	System.out.println(batteryDuration);
}
}
