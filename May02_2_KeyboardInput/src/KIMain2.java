import java.util.Scanner;

public class KIMain2 {
	public static void main(String[] args) throws InterruptedException {
		// 메뉴판 (분식집)
		// 떡볶이, 순대, 어묵, 튀김, ...
		// 가격을 입력받아서
		// 메뉴판 모양으로 출력
		Scanner keyboard = new Scanner(System.in);
		System.out.println("떡볶이 가격:");
		int priceTBK = keyboard.nextInt();
		System.out.println("순대 가격:");
		int priceSOONDAE = keyboard.nextInt();
		System.out.println("어묵 가격:");
		int priceUmook = keyboard.nextInt();
		System.out.println("튀김 가격:");
		int priceFriedfoods = keyboard.nextInt();
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.printf("┃떡볶이 \t: %,7d원\t┃\n", priceTBK);
		System.out.printf("┃순대 \t: %,7d원\t┃\n", priceSOONDAE);
		System.out.printf("┃어묵 \t: %,7d원\t┃\n", priceUmook);
		System.out.printf("┃튀김 \t: %,7d원\t┃\n", priceFriedfoods);
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━┛");

	}

}
