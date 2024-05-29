import java.util.Random;

public class Referee {
	Random brain = new Random();
int answer;	
public void getRandomNum() {
	answer = brain.nextInt(100) + 1;
}
	
	
	// 심판이 나 호출
public void callMe(Me m) {
	System.out.printf("%s님 나와주세요.\n", m.name);
}

//     심판이 친구에게 답 요구
public void requestToFriend(Friend f) {
	System.out.printf("%s님 답을 적어주세요 : ", f.name);
}

//     심판이 나에게 답 요구
public void requestToMe(Me m) {
	System.out.printf("%s님 답을 말해주세요 : ", m.name);
}

//     심판의 판정
public void judgeResult(Me m, Friend f) {
	for (int i = 1; true; i++) {
		
		
	if (f.answer == answer) {
		System.out.printf("%s님 정답!\n", f.name);
		System.out.printf("%d번째 만에 정답!", i);
	break;
	}else if (f.answer < answer) {
		System.out.printf("%s님 UP!\n", f.name);	
		requestToFriend(f);
		f.printAnswer();
	}else if (f.answer > answer) {
		System.out.printf("%s님 Down!\n", f.name);
		requestToFriend(f);
		f.printAnswer();
	}
	System.out.println();
	if (m.answer == answer) {
		System.out.printf("%s님 정답!\n", m.name);
		System.out.printf("%d번째 만에 정답!", i);
		break;
	}else if (m.answer < answer) {
		System.out.printf("%s님 UP!\n", m.name);
		requestToMe(m);
		m.tellMyAnswer();
		if (m.answer == answer && f.answer == answer) {
			System.out.println("둘다 정답!");
			System.out.printf("%d번째 만에 정답!", i + 1);
			break;
		}else if (m.answer == answer) {
			System.out.printf("%s님 정답!", m.name);
			System.out.printf("%d번째 만에 정답!", i + 1);
			break;
		}
	}else if (m.answer > answer) {
		System.out.printf("%s님 Down!\n", m.name);
		requestToMe(m);
		m.tellMyAnswer();
		if (m.answer == answer && f.answer == answer) {
			System.out.println("둘다 정답!");
			System.out.printf("%d번째 만에 정답!", i + 1);
			break;
		}else if (m.answer == answer) {
			System.out.printf("%s님 정답!", m.name);
			System.out.printf("%d번째 만에 정답!", i + 1);
			break;
		}

	}
	if (m.answer == answer && f.answer == answer) {
		System.out.println("둘다 정답!");
		System.out.printf("%d번째 만에 정답!", i);
		break;
		
	}

}
	System.out.println(answer);
}
//     메소드 모으기
public void start(Me m, Friend f) {
	getRandomNum();
	callMe(m);
	requestToFriend(f);
	f.printAnswer();
	requestToMe(m);
	m.tellMyAnswer();
	judgeResult(m, f);
}
}
