import java.util.Random;
import java.util.Scanner;

public class FMain6 {
	// 랜덤한 정수를 '출력'하는 함수!
	public static void printNum() {
		Random r = new Random();
		int random = r.nextInt();
		System.out.println(random);
	}
	// 랜덤한 정수를 '생성'하는 함수!
	public static int createNum() {
		Random r= new Random();
		int randomNum = r.nextInt();
		return randomNum;// randomnum에 있는 값을 최종결과로 리턴
		// 이 함수는 종료
	}
	// 정수를 하나 넣으면 홀수인지 짝수인지 출력하는 함수!
	public static void printJudge(int a) {
		String cor = a % 2 == 1 ? "홀수" : "짝수";
		System.out.printf("%d는 %s!\n",a ,cor);
		
		
	}
	// 정수를 두 개 넣었을 대, 앞 숫자가 크면 '앞', 뒷 숫자가 크거나 같으면 '뒤' 생성하는 함수!
	public static String judge(int a, int b) {
		String frontBack = a > b ? "앞" : "뒤";
		return frontBack;

		
			
	}
	public static void main(String[] args) {
	    printNum();
		int randomNum = createNum();
		int randomNum2 = createNum();
		printJudge(randomNum);
		judge(randomNum, randomNum2);
		String fb = judge(randomNum, randomNum2);
		String menu = fb.equals("앞") ? "국밥" : "라면";
		System.out.println("오늘 메뉴는"+menu);
		
		// 저녁메뉴 (2가지 중 하나)
		// 위의 함수를 이용해서 
		//   랜덤한 숫자 2개를 뽑아서
		//   먼저 뽑힌게 크면 '초밥', 아니면 '파스타'를 출력
		
		
	}

}




















