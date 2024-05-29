
// 지역변수(Local Variable)
//     메소드 속에서 만든 변수
//     그 행동을 하는 동안에만 필요한 임시변수로..
// 메소드 파라미터 (Parameter)
//     그 행동을 하는데 필요한 재료
// 리턴되는 값
//     그 행동을 한 후에 결과물
// 멤버변수 (Member Variable)
//     그 객체의 속성



public class Doctor {
String name;
int age;


public void printInfo() {
	System.out.println(" << 의사 >>");
	System.out.println("name : "+name);
	System.out.println("age : "+ age);
}

public void greeting(Customer c1) {
	System.out.println(" << 의사 >>");
	System.out.printf("\"%s님 반갑습니다.\"\n", c1.name);
	System.out.println();
}
public void printHowMuchHeight() {
	System.out.println(" << 의사 >>");
	System.out.println("\"키가 어떻게 되세요?\"");
	System.out.println();
}
public void printHowMuchWeight() {
	System.out.println(" << 의사 >>");
	System.out.println("\"몸무게가 어떻게 되세요?\"");
	System.out.println();
}
public double getBMI(double H, double W) {
	double BMI = W / (H*H/10000);
	return BMI;
}
public String judge(double BMI) {
	String result = null;
	if (BMI < 18.5) {
		result = "저체중";
	}else if (BMI < 25) {
		result = "정상";
	}else if (BMI < 30) {
		result = "과체중";
	}else if (BMI < 35) {
		result = "경도비만";
	}else if (BMI < 40) {
		result = "중증도비만";
	}else {
		result = "고도비만";
	}
	return result;
}
public void printResult(double H, double W, double BMI, String result) {
	System.out.println(" << 의사 >>");
	System.out.printf("\"당신의 키는 %.1fcm이고"
			+ "\n당신의 체중은 %.1fkg이고\n"
			+ "당신의 BMI는 %.1f이므로\n"
			+ "당신은 %s입니다\"", H, W, BMI, result);
	System.out.println();
}
public void start( Customer c1) {
	
//	System.out.println(" << 의사 >>");
//	System.out.printf("\"만나서 반갑습니다 %s님\"\n", name);
//	System.out.println();
	greeting(c1);
	printHowMuchHeight();
	double height = c1.answerHeight();
	printHowMuchWeight();
	double weight = c1.answerWeight();
	double BMI = getBMI(height, weight);
	String judge =judge(BMI);
	printResult(height, weight, BMI, judge);
}

public void lesson(Customer c) { // 파라미터에 다른 클래스 값을 넣어도 가능
	System.out.println(c.height);
}



}
