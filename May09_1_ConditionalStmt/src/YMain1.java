import java.util.Scanner;

public class YMain1 {
	
	// (3보다 작은)정수를 하나 입력받는 함수
	// 3보다 크거나 같을 때 => 정수를 다시 입력 받을 수 있도록!
	public static int getNum1() {
		Scanner k = new Scanner(System.in);
		System.out.print("3보다 작은 정수를 하나 입력하세요 : ");
		int num = k.nextInt();
//		int judge = num < 3 ? num : getNum1();
//		return judge;
		if (num < 3) {
			return num;
		} else {
			getNum1();
		} return getNum1();
	}
	
	// 홀수만 입력 받을 수 있는 함수
	// => 짝수를 입력하면 다시 입력 받을 수 있도록!
	public static int getNum2() {
		Scanner k = new Scanner(System.in);
		System.out.print("홀수를 입력하세요 : ");
		int num = k.nextInt();
//		int judge = 0 < num && num % 2 == 1 ? num : getNum2();
//		return judge;
		if (0 < num && num % 2 == 1) {
		} else {
			getNum2();
		} return getNum2();
	}
	
	// 정수를 입력받는 함수 = > 0 ~ 100
	//  => 범위안의 정수가 아니라면 다시 입력 받을 수 있도록!
	public static int getNum3() {
		Scanner k = new Scanner(System.in);
		System.out.print("0 ~ 100 중 아무 정수를 입력하세요 : ");
		int num = k.nextInt();
//		int judge = -1 < num && num < 101 ? num : getNum3();
//		return judge;
		if (0 <= num && num <= 100) {
			return num;
		} else {
			getNum3();
		} return num;
	}
	public static void main(String[] args) {
//		int a = getNum1();
//		System.out.println(a);
//		int b = getNum2();
//		System.out.println(b);
//		int c = getNum3();
//		System.out.println(c);
		System.out.println(getNum1());
		System.out.println(getNum2());
		System.out.println(getNum3());
	}

}


























