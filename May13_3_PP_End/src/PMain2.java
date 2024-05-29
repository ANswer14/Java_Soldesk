import java.util.Scanner;

public class PMain2 {
	
	// ATM기능을 하는 프로그램
	//  1을 고르면 입금 / 2를 고르면 출금 / 3을 고르면 잔액 확인
	//  4을 고르면 프로그램 종료
	//  입금, 출금 돈 값을 입력 받을 것!
	//  main 함수에
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int insertMoney = 0;
		int takeMoney = 0;
		int select = 0;
		int restMoney = 0;
		a : while (true) {
			System.out.print("============================\n"
					+ "1번 : 입금\n"
					+ "2번 : 출금\n"
					+ "3번 : 잔액 확인 \n"
					+ "4번 : 프로그램 종료\n"
					+"할 일에 해당하는 번호를 입력하시오 : ");
			select = k.nextInt();
			System.out.println();
			if (select == 1) {
				System.out.print("입금할 액수 : ");
				insertMoney = k.nextInt();
				System.out.printf("%,d원을 입금했습니다.\n", insertMoney);
				restMoney += insertMoney;
			}else if (select == 2 ) {
				System.out.print("출금할 액수 : ");
				takeMoney = k.nextInt();
				if (takeMoney <= restMoney) {
					System.out.printf("%,d원을 출금했습니다.\n", takeMoney);
					restMoney -= takeMoney;
				}else {
					System.err.println("잔액이 부족합니다.\n");
				}
			}else if (select == 3) {
				System.out.println("잔액 확인");
				System.out.printf("%,d 원 남았습니다.\n", restMoney);
			}else if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break a;
			}
		}
	}

}

































