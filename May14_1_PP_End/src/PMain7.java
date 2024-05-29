import java.util.Scanner;

public class PMain7 {
	// 거스름돈 환전 프로그램
	// 함수 사용 (O)
	
	// < 입력 >
	// 구매한 물건 가격 : 3500
	// 낸 돈 : 41530
	// -----------------------
	// 거스름돈 : 6530 을
	//     50000 : 0
	//     10000 : 0
	//     5000 : 1
	//     1000 : 1
	//      500 : 1
	//      100 : 0
	//       50 : 0
	//       10 : 3
	//       0개짜리는 출력 X!
	
	// 물건 가격
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.print("구매한 물건 가격 : ");
		int price = k.nextInt();
		return price;
	}
	
	// 낸 돈
	public static int getMyMoney(int price) {
		Scanner k = new Scanner(System.in);
		System.out.print("낸 돈 : ");
		int myMoney = k.nextInt();
		if (myMoney < price) {
			System.out.println("돈이 부족합니다. 다시 입력하세요.");
		}
		return myMoney >= price ? myMoney : getMyMoney(price);
	}
	
	// 거스름돈 계산
	public static int getChange(int price, int money) {
		return money - price;
	}
	// 위에 3개 출력
	public static void printResult(int price, int money, int change) {
		System.out.printf("물건 가격 : %d원\n", price);
		System.out.printf("낸 돈 : %d원\n", money);
		System.out.printf("거스름돈 : %d원\n", change);
	}
	// 거스름돈을 화폐에 따라 어떻게 줄 것인지
	public static void printChange(int change) {
		// 2가지 방법..
		// 1.
		
//		int[] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		for (int i = 0; i < currency.length; i++) {
//			if (change >= currency[i]) {
//				System.out.printf("%d원권 : %d개\n", currency[i],
//						change / currency[i]);
//				change %= currency[i];
//			}
//		}
		
		//2.
		
		int currency2 = 100000;
		while (true) {
			currency2 /= 2;
			if (change >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2
						, change / currency2);
				change %= currency2;
			}
			
			currency2 /= 5;
			if (change >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2
						, change / currency2);
				change %= currency2;
			}
			
			if (currency2 == 10) {
				break;
			}
			
		}
		
		// 3.
		// 내가 한 방법
//		int[] money = new int[8];    
//		int tool = 50000;
//		int tool2 = 10000;
//		for (int i = 0; i < 8; i++) {
//			if (i % 2 == 0) {
//				money[i] = change / tool;
//				change -= money[i] * tool;
//				System.out.printf("%,d원 : %d개\n", tool, money[i]);
//				tool /= 10;
//		}else if (i % 2 == 1) {
//			money[i] = change / tool2;
//					change -= money[i] * tool2;
//					System.out.printf("%,d원 : %d개\n", tool2, money[i]);
//			tool2 /= 10;
//		}
//		}
//		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		int price = getPrice();
		int money = getMyMoney(price);
		int change = getChange(price, money);
		printResult(price, money, change);
		printChange(change);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
