import java.util.Random;

public class Computer {
	Random cpu= new Random();
int comCoins = 20;
//유저에게 몇개 할지 물어보기
public void askToUserHowMany() {
	System.out.println("<<<\t컴퓨터\t>>>");
	System.out.println("동전20개 중 최대 몇 개로 선택하시겠습니까 ? ");
}

// 동전 무작위로 흔들기
public void playShake(User u) {
	comCoins = cpu.nextInt(u.userAnswerCoins) + 1;
}

// 유저에게 답 물어보기
public void askToUserHJ() {
	System.out.println("<<<\t컴퓨터\t>>>");
	System.out.println("홀 or 짝 고르시오");
}

// 정답 판정
public void printJudge(int answer) {
	System.out.println("<<<\t컴퓨터\t>>>");
	if (answer == 0 ) {
		System.out.println("틀렸습니다.");
	}else if (answer == 1) {
		System.out.println("정답 !");
	}
	System.out.printf("동전 갯수 : %d개",comCoins);
}

// 함수 모으기
public void start(User u, Computer c) {
	askToUserHowMany();
	u.userAnswerHowMany();
	playShake(u);
	askToUserHJ();
	int answer = u.userAnswerHJ(c);
	printJudge(answer);
}


}
