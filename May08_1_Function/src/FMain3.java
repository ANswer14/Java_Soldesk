import java.util.Random;
import java.util.Scanner;

public class FMain3 {
	// 홀짝 게임(함수.ver)
	// 랜덤한 동전 갯수 가져오기
	public static int getRandomNum() {
//		Random r= new Random();
//		int randomNum = r.nextInt(10) + 1;
		return new Random().nextInt(10) + 1;
	}
	//질문 & 답 입력
	public static String getMyDetermination() {
	//	Scanner k = new Scanner(System.in);
		System.out.print("내가 선택할 홀 or 짝 : ");
	//	String myJudge = k.next();
		return new Scanner(System.in).next();
	}
	//동전 갯수가 홀수면 '홀', 짝수면 '짝'
	public static String judgeOfCom(int randomNum) {
	//	String computer = randomNum % 2 == 1 ? "홀" : "짝";
		return randomNum % 2 == 1 ? "홀" : "짝";
	}
	// 비교해서 결과내기
	public static String getResult(int randomNum,String computer,
			String myJudge) {
	//	String result = myJudge.equals(computer)? "정답!" : "오답!";
		return myJudge.equals(computer)? "정답!" : "오답!";
	}
	// 출력
	public static void printResult(int randomNum, String computer,
			String myJudge, String result) {
		System.out.println("컴퓨터가 뽑은 숫자: "+randomNum);
		System.out.println("컴퓨터가 뽑은 수의 홀 or 짝 : "+computer);
		System.out.println("내가 선택한 홀 or 짝 : "+ myJudge);
		System.out.println("결과 : "+ result);
	}
	// 함수들 모으기
	public static void start() {
	//  int randomNum = getRandomNum();	
	//	String computer = judgeOfCom(getRandomNum());
	//	String myJudge = getMyDetermination();
	//	String result = getResult(getRandomNum(), judgeOfCom(getRandomNum()), getMyDetermination());
		printResult(getRandomNum(),
				judgeOfCom(getRandomNum()),
				getMyDetermination(),
				getResult(getRandomNum(),
						judgeOfCom(getRandomNum()),
						getMyDetermination()));
		
	}
	public static void main(String[] args) {
		start();
	}
	

}


















