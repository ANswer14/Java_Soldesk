import java.util.Random;

public class FMain1 {
	
	// B : 함수명 / 기능이 대충이라도 보이게, 동사같은 작명, 낙타체 or 뱀체
	// C : 파라미터 / 함수를 호출하는 쪽(main 함수)에서 해당 함수로
	//             데이터를 보낼 때
	//             ( 자료형 변수명, 자료형 변수명, ... )
	// A : 리턴타입 / 해당 함수에서 작업한 결과를 호출한 쪽(main)
	//              으로 보낼 때
	//           return 예약어와 한 쌍
	
	// public static A B (C) {
	//            내용
	//          return
	// }
	
	// 랜덤한 정수 하나를 구하는 함수
	public static int createNum() {
		Random r= new Random();
		int num = r.nextInt();
		return num;
	}
	
	// 두 정수를 더한 값을 출력하는 함수
	public static void printSummedNum(int a, int b) {
		System.out.printf("정수 a = %,d이고,\n정수 b = %,d 이므로\n"
				+ "a + b = %,d이다.\n", a , b , a + b);
	}
	
	// 정수 두개를 넣으면, 그 중에서 큰 숫자를 출력해주는 함수
	//  (두 숫자가 같으면 뒤의 숫자 출력)
	public static void printBiggerNum(int a, int b) {
		int result = a > b ? a : b;
		System.out.println(result);
	}
	
	// 실수 두개를 넣으면, 그 중에서 큰 숫자를 구해주는 함수
	//  (두 숫자가 같으면 뒤의 숫자 구하기)
	public static double getBiggerFloat(double a, double b) {
		double result = a > b ? a : b;
		return result;
		
	}
	
	public static void main(String[] args) {
		// 랜덤한 정수 2개를 구해서...
		int randomNum1 = createNum();
		int randomNum2 = createNum();
		// 그 2개의 수를 더한 값을 출력
		printSummedNum(randomNum1, randomNum2);
		printBiggerNum(randomNum1, randomNum2);
		getBiggerFloat(3.5, 4.6);
	}

}





























