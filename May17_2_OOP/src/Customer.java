import java.util.Scanner;

public class Customer {
String name;
int age;
double height;
double weight;
Scanner mouth = new Scanner(System.in);

public double answerHeight() {
	System.out.println(" << 손님 >> ");
	System.out.print("키를 입력하세요> ");
	height = mouth.nextDouble();
	System.out.printf("\"%.1fcm 입니다.\"\n", height);
	System.out.println();
	return height > 0 ? height : answerHeight();
			
}
public double answerWeight() {
	System.out.println(" << 손님 >> ");
	System.out.print("몸무게를 입력하세요> ");
	weight = mouth.nextDouble();
	System.out.printf("\"%.1fkg 입니다.\"\n", weight);
	System.out.println();
	return weight > 0 ? weight : answerWeight();
}




}
