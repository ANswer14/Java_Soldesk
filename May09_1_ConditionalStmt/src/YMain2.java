import java.util.Scanner;

public class YMain2 {
	// 정수 2개를 입력받아서 (각각의 함수에)
	// 그 정수 2개를 더했을 때 짝수면 결과 리턴, 아니면 값을 재입력
	
	// 정수입력1
	public static int getNum1() {
		Scanner k = new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		int num1 = k.nextInt();
		return num1;
	}
	
	// 정수입력2
	public static int getNum2() {
		Scanner k = new Scanner(System.in);
		System.out.print("두번째 숫자:");
		int num2 = k.nextInt();
		return num2;
	}
	//합 + 결과 비교
	public static int compareResult(int num1, int num2) {
		int sum = num1 + num2;
//		int result = (sum) % 2 == 0 ? sum : compareResult(getNum1(), getNum2());
//		return result;
		if (sum % 2 == 0) {
			System.out.println("합 : "+ sum);
		} else {
			compareResult(getNum1(), getNum2());
		}return sum;
	}
	public static void start() {
		int num1 = getNum1();
		int num2 = getNum2();
//		System.out.printf("합 : %d\n", compareResult(num1, num2));
		compareResult(num1, num2);
	}
	//main함수
	public static void main(String[] args) {
		start();
	}
	

}




























