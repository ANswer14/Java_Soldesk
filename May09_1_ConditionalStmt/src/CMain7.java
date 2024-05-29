import java.util.Scanner;

public class CMain7 {
	// f1 : 정수를 하나 입력 받아서
	// 그게 양수면 "양" / 0이면 "0" / 음수면 "음" 출력
	
	// f2 : 정수를 하나 입력 받아서
	//  3의 배수면 "3의 배수"
	//  4의 배수면 "4의 배수"
	//  둘 다 아니면 "몰라!!!"
	//  를 판정해주는 함수
	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = k.nextInt();
		if (num > 0) {
			System.out.println("양수");
		}else if (num == 0) {
			System.out.println("0");
		}else {
		    System.out.println("음");
        }
	}
	public static void f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = k.nextInt();
	    if (num % 12 == 0) {
		System.out.println("3의 배수, 4의배수");
	    } else if (num % 3 == 0) {
			System.out.println("3의 배수");
		} else if (num % 4 == 0) {
			System.out.println("4의 배수");
		} else {
			System.out.println("몰라!!!");
		}
	}
	public static void main(String[] args) {
		f1();
		f2();
	}

}
