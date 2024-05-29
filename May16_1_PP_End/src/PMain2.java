import java.util.Random;
import java.util.Scanner;

// UP&DOWN게임(함수 사용 O)
// 컴퓨터 1 ~ 100 사이의 숫자를 뽑음 (ex : 34)
// 유저가 입력
//      1트 : 50 => down!
//      2트 : 20 => up!
//     ...
//      10트 : 34 => 정답 !
// 몇번째만에 맞췄는지도 출력
public class PMain2 {
	// 내 방법
	
//	public static int getComNum() {
//		Random r= new Random();
//		int comNum = r.nextInt(100) + 1;
//		return comNum;
//	}
//	
//	public static void playGameAndPrintResult(int comNum) {
//		Scanner k = new Scanner(System.in);
//		int userNum = 0;
//		for (int i = 0;true; i++) {
//			System.out.print("번호를 입력하세요 :");
//			userNum = k.nextInt();
//			System.out.printf("%d트 : %d\n", i + 1, userNum );
//			if (userNum < comNum) {
//				System.out.println("Up!");
//			}else if (userNum == comNum) {
//				System.out.printf("%d트 만에 정답!", i + 1);
//				break;
//			}else {
//				System.out.println("Down!");
//			}
//			
//			
//		}
//	}
//	
//	public static void start() {
//		int comNum = getComNum();
//		playGameAndPrintResult(comNum);
//	}
//	
//	public static void main(String[] args) {
//		start();
//	}
    //  강사님의 방법
	
	//컴퓨터가 1 ~ 100 사이의 정수를 하나 뽑아주는 함수
	public static int getNumber() {
		return new Random().nextInt(100) + 1;
	}
	
	// 유저가 답을 입력할 수 있는 함수
	public static int getUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("정답은 ? : ");
		int answer = k.nextInt();
		if (answer < 1) {
			System.out.println("정답은 1 이상이어야 합니다.");
		}else if (answer > 100) {
			System.out.println("정답은 100 이하이어야 합니다.");
		}
		return answer >= 1 && answer <= 100 ? answer : getUserAns();
	}
	
	// 정답은 한 번 입력했을 때 정답인지 아닌지 확인
	//     + 정답일 때 반복문을 깰지 말지 전달됨
	public static boolean checkAnswer(int number, int answer) {
		if (number == answer) {
			System.out.print("정답은 ");
//			return true;    //정답일 때 true값을 리턴하면서 종료되게
		}else if (number > answer) {
			System.out.println("Up !");
//			return false;   //정답이 아닐때 false값을 리턴하면서 게임이
			                // 계속 진행되도록
		}else {
			System.out.println("Down !");
//			return false;
		}return number == answer;  // 이 조건에 맞을 때 true값을 리턴하고,
		                             // 조건에 맞지 않으면 false값을 리턴
	}
	
	// 정답을 맞출때까지 반복하는 함수
	public static void printResult() {
		int number = getNumber();
		int answer = 0;
		int turn = 0;
		
		while (true) {
			turn++;
			answer = getUserAns();
			if (checkAnswer(number, answer)) {  // boolean에서 온 값이 true면 이 if문 실행, 아니면 실행X
				System.out.printf("[%d] !\n", number);
				System.out.printf("%d번 만에 정답 !\n", turn);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		printResult();
	}
	
	
	
	
}
