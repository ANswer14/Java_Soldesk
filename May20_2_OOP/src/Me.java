import java.util.Scanner;

public class Me {
	Scanner mouth = new Scanner(System.in);
String name = "이영훈";
int answer;
public void tellMyAnswer() {
	while (true) {
		
	 answer = mouth.nextInt();
	 if (answer < 1 || answer > 100) {
		System.out.println("'부적절한 번호이다 다시 생각해보자.'");
	}else {
		break;
	}
	 
	}
	
	System.out.printf("\"제 답은 %d입니다.\"\n", answer);
}
}
