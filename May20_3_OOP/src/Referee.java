
public class Referee {
//int draw;
//int win;
//	
//	public void printRuleGuide() {
//		System.out.println("<<가위바위보 안내서>>");
//		System.out.println("1. 1을 입력하면 가위");
//		System.out.println("2. 2를 입력하면 바위");
//		System.out.println("3. 3을 입력하면 보");
//	}
//	
//	public void askMe() {
//		System.out.println("\"번호를 고르세요\"");
//	}
//	
//	public void judge(Someone s, Me m) {
//		String result1 = null;
//		String result2 = null;
//		while (true) {
//			if (m.answer == 1) {
//				result1 = "가위";
//			}else if (m.answer == 2) {
//				result1 = "바위";
//			}else if (m.answer == 3) {
//				result1 = "보";
//			}
//			if (s.answer == 1) {
//				result2 = "가위";
//			}else if (s.answer == 2) {
//				result2 = "바위";
//			}else if (s.answer == 3) {
//				result2 = "보";
//			}
//			
//		if (m.answer == s.answer) {
//			System.out.printf("\"나 : %s vs S : %s 이므로 ", result1, result2);
//			System.out.println("무승부\"");
//			draw++;
//			s.answer();
//			askMe();
//			m.answer();
//		}else if (m.answer - s.answer == -1 || m.answer - s.answer == 2) {
//			System.out.printf("\"나 : %s vs S : %s 이므로 ", result1, result2);
//			System.out.println("승리\"");
//			win++;
//			s.answer();
//			askMe();
//			m.answer();
//		}else {
//			System.out.printf("\"나 : %s vs S : %s 이므로 ", result1, result2);
//			System.out.println("패배\"");
//			break;
//		}
//		}
//		System.out.printf("%d승 %d무", win, draw);
//	}
//
//    public void collect(Someone s, Me m) {
//    	printRuleGuide();
//    	s.answer();
//    	askMe();
//    	m.answer();
//    	judge(s, m);
//    }

	// 강사님의 풀이
	String[] rulebook = new String[] { " ", "가위", "바위", "보" };

	public void readRulebook() {
		System.out.println("==================");
		for (int i = 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("==================");
	}

	// 뭐낼지 물어보기
	// Over loading...!
	public int askAns(Me m) {
		System.out.printf("마루 뭐낼래 ? :");
		int maruAns = m.fire();
		return (maruAns >= 1 && maruAns <= 3) ? maruAns : askAns(m);
	}

	public int askAns(Someone s) {
		int broAns = s.fire();
		return broAns;
	}

	// 누가 뭐 냈는지
	public void printHand(Me m, Someone s) {
		System.out.printf("마루는 %s\n", rulebook[m.hand]);
		System.out.printf("동생은 %s\n", rulebook[s.hand]);
	}

	// 판정
	public boolean judgeWin(Me m, Someone s) {
		int result = m.hand - s.hand;
		if (result == 0) {
			System.out.println("비겼다 !");
			m.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("동생이 이겼다 !");
		} else {
			System.out.println("마루가 이겼다 !");
			m.win++;
		}
		return result == -1 || result == 2;
	}
	
	public void sayMaruWin(Me m) {
		System.out.printf("마루는 %d번 비겼고, %d개의 간식을 얻을거야 !\n", m.draw, m.win);
	}
	
	public void start(Me m, Someone s) {
		readRulebook();
		while (true) {
			m.hand = askAns(m);
			s.hand = askAns(s);
			printHand(m, s);
			System.out.println("====================");
			if (judgeWin(m, s)){
				sayMaruWin(m);
				break;
			}		
			System.out.println("====================");
		}
	}
	
}

// 1   1    0   
//     2    -1   패
//     3    -2   승
// 2   1    1    승
// 2   2    0
// 2   3    -1   패
// 3   1    2    패
// 3   2    1    승
// 3   3    0