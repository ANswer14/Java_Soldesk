import java.util.Scanner;

public class User {
	Scanner mouth = new Scanner(System.in);
int userAnswerCoins;

// 유저의 동전갯수 대답
public void userAnswerHowMany() {
	System.out.println("<<<\t유저\t>>>");
		while (true) {
		
	userAnswerCoins = mouth.nextInt();
	if (userAnswerCoins < 2 || userAnswerCoins > 20) {
		System.err.println("'부적절한 갯수다 다시 생각해보자.'");
	}else {
		break;
	}

	}

}

// 유저의 정답
public int userAnswerHJ(Computer c) {
	System.out.println("<<<\t유저\t>>>");
	String answer = null;
	while (true) {
		
	answer = mouth.next();
	if (answer.equals("홀") && c.comCoins % 2 == 1||answer.equals("짝")&& c.comCoins % 2 == 0) {
		return 1;
	}else if (answer.equals("홀") && c.comCoins % 2 == 0||answer.equals("짝")&& c.comCoins % 2 == 1) {
		return 0;
	}else {
		System.err.println("'부적절한 대답이다 다시 생각해보자.'");
	}
	}
}

	
	
	
	
	

	
	
	
	

	
}
