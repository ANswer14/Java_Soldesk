import java.util.Random;
import java.util.Scanner;

public class PMain5 {
	// 로또
	// 컴퓨터가 1 ~ 45 사이의 정수 중 6개 숫자를 뽑음 (중복 X)
	// 유저가 숫자 6개를 입력
	// 6개 일치 : 1등 / 5개 일치 : 2등 / 4개 일치 : 3등 / 그외 : 꽝
	//          => 출력
	
	// 내 방법
//	public static int[] getComNum() {
//		Random r = new Random();
//		int[] comNum = new int[6];
//		for (int i = 0; i < comNum.length; i++) {
//			comNum[i] = r.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (comNum[j] == comNum[i]) {
//					i--;
//				}
//				
//			}
//			System.out.println(comNum[i]);
//		}
//		return comNum;	
//	}
//	
//	public static int[] getUserNum() {
//		Scanner k = new Scanner(System.in);
//		int[] userNum = new int[6];
//		for (int i = 0; i < userNum.length; i++) {
//			System.out.println("번호 입력 : ");
//			userNum[i] = k.nextInt();
//			while (true) {
//				
//			if (userNum[i] < 1 || userNum[i] > 45) {
//				System.out.println("부적절한 번호입니다.\n다시 입력해주십시오.");
//				System.out.println("번호 입력 : ");
//				userNum[i] = k.nextInt();
//			}else {
//				break;
//			}
//			}
//		}
//		for (int j = 0; j < userNum.length; j++) {
//			System.out.printf("%d번째 내가 뽑은 번호 : %d\n", j + 1, userNum[j]);
//		}
//		return userNum;
//	}
//
//	
//	
//	public static int judge(int[] comNum, int[] userNum) {
//		int correct = 0;
//		int wrong = 0;
//		for (int i = 0; i < 6; i++) {
//			if (comNum[i] == userNum[i]) {
//				correct ++;
//			}else {
//			}
//		}
//	return correct;
//}
//    
//	public static void printResult(int correct) {
//		if (correct == 6) {
//			System.out.println("1등");
//		}else if (correct == 5) {
//			System.out.println("2등");
//		}else if (correct == 4) {
//			System.out.println("3등");
//		}else {
//			System.out.println("꽝");
//		}
//		}
//	
//	public static void start() {
//		int[] comNum = getComNum();
//		int[] userAns = getUserNum();
//		int correct = judge(comNum, userAns);
//		printResult(correct);
//	}
//	
//	public static void main(String[] args) {
//		start();
//	}
	
	// 강사님의 방법
	public static int getNum() {
		Scanner k = new Scanner(System.in);
		int num = k.nextInt();
		if (num < 1 || num > 45) {
			System.out.print("다시 입력 :");
		}
		return num >= 1 && num <= 45 ? num : getNum();
	}
	
	public static int[] getNums() {
		int[] myAnswer = new int[6];
		for (int i = 0; i < myAnswer.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			myAnswer[i] = getNum();
		}
	return myAnswer;	 
	}
	
	public static void printMyAnswer(int[] myAnswer) {
		for (int i : myAnswer) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		System.out.println("============================");
	}
	
	public static int[] getLotto() {
		int[] lottoNum = new int[6];
		Random r = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = r.nextInt(45) + 1;
			// 앞의 배열요소와 뒤의 배열요소의 값을 구분하기 위해서 반복문 추가
			for (int j = 0; j < i; j++) { // 인덱스값이 하나 덜 나오게 해야 비교 가능
				System.out.println(lottoNum[j] + " " + lottoNum[i]);
				
				// i번째에서 뽑은거랑 이전꺼에서 뽑은 값을 비교해서
				if (lottoNum[j] == lottoNum[i]) {
					i--; // 중복된 값이 있으면 제거하고 첫번째 for문으로 가서 다시 뽑는다
				}
				
			}
		}
		return lottoNum;
	}
	
	public static void printLottoNum(int[] lottoNum) {
		System.out.println("로또 번호");
		for (int i : lottoNum) {
			System.out.println("[" + i + "]");
		}
		System.out.println();
		System.out.println("=============================");
	}
	
	
	// 입력한 번호와 랜덤으로 봅힌 번호를 모든 경우의 수로 값이 같은지 비교
	// 같은 경우에는 카운트 올리기
	public static int checkNum(int[] myAnswer, int[] lottoNum) {
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) {
			for (int j = 0; j < myAnswer.length; j++) {
				if (lottoNum[i] == myAnswer[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	
	public static void printResult(int count) {
		System.out.printf("%d개 맞춰서...", count);
		if (count == 6) {
			System.out.println("1등 !");
		}else if (count == 5) {
			System.out.println("2등 !");
		}else if (count == 4) {
			System.out.println("3등 !");
		}else {
			System.out.println("꽝 !");
		}
	}
	
	
	public static void activate() {
		int[] lottoNum = getLotto();
		int[] myAnswer = getNums();
		printMyAnswer(myAnswer);
		printLottoNum(lottoNum);
		int count = checkNum(myAnswer, lottoNum);
		printResult(count);
	}
	
	public static void main(String[] args) {
		activate();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
