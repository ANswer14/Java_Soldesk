
public class Computer {
String CPU;
String RAM;
String HDD;
Company brand;

public Computer() {
	// TODO Auto-generated constructor stub
}


public Computer(String cPU, String rAM, String hDD, Company brand) {
	super();
	CPU = cPU;
	RAM = rAM;
	HDD = hDD;
	this.brand = brand;
}


public void printInfo() {
	System.out.println("CPU명 : "+CPU);
	System.out.println("RAM명 : "+RAM);
	System.out.println("HDD명 : "+HDD);
//	System.out.println(brand.name);
//	System.out.println(brand.location);
//	System.out.println(brand.employee);
	brand.printInfo();
}
}
