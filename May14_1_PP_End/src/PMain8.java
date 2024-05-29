import java.util.Random;
import java.util.Scanner;

// 주사위 게임 (main함수만 사용 O)
//  유저와 컴퓨터가 각각 주사위를 3개씩 굴려서 그 합이 높은 숫자가
//      나온쪽이 이기는 게임
//  1번 메뉴
//      유저와 컴퓨터는 각각 주사위 3개씩 굴릴 것
//      유저는 굴린 주사위의 값을 확인한 후 (주사위의 합까지)
//      돈을 배팅할 수 있게 해서
//      이기면 그 돈만큼 따고, 지면 잃게 됨
//      소지금보다는 많이 배팅할 수 없고, 기본 소지금은 10000원으로 시작
//      한 판 끝내면 재도전 의사를 물을 것
//      소지금 다 잃으면 메뉴로 돌아가기
//  2번 메뉴
//      전적확인 (승 / 무 / 패 / 소지금)
//  3번 메뉴
//      대출 기능
//  4번 메뉴
//      상환 기능
//  5번 메뉴
//      프로그램 종료


public class PMain8 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		Random r= new Random();
		int random = 1;
		int menu = 1;
		int comSum = 0;
		int userSum = 0;
		int betMoney = 0;
		int money = 10000;
		int wins = 0;
		int lose = 0;
		int borrowMoney = 0;
		String retry = "a";
		int stop = 0;
		int accumulateLoan = 0;
		int repayMoney = 0;
		int draw = 0;
	b :	while(true) {
		System.out.println("=======================================");
		System.out.println("1. 게임\n2. 전적확인\n3. 대출\n4. 상환\n5. 프로그램 종료");
		System.out.println("=======================================");
			System.out.print("선택 : ");
			menu = k.nextInt();
			if (menu == 1) {
			a :	for (int i = 0; true; i++) {
					
				for (int j = 0; j < 3; j++) {
					random = r.nextInt(6) + 1;
					comSum += random;
				}
			c :	for (int j = 0; j < 3; j++) {
					random = r.nextInt(6) + 1;
					System.out.printf("%d번째 주사위의 값 : %d\n", j + 1, random);
					userSum += random;	
				}
			System.out.println("=======================================");
				System.out.printf("유저의 눈의 합 : %d\n", userSum);
				for (int j = 0; true; j++) {
					
				System.out.println("배팅 금액 : ");
				betMoney = k.nextInt();
				if (money < betMoney) {
					System.out.println("돈이 부족합니다.");
					System.out.printf("현재 소지금 : %d원\n", money);
				}else if (betMoney > 0 ) {
					break;
				}else if (betMoney < 0) {
					betMoney = 0;
					break;
				}
				
				}
				if (userSum > comSum) {
					System.out.printf("컴퓨터의 눈의 합 : %d\n", comSum);
					System.out.println("☆승리☆");
					money += betMoney;
					wins ++;
					userSum = 0;
					comSum = 0;
					System.out.printf("현재 소지금 : %d원\n", money);
					if (money == 0) {
						System.out.println("돈이 없습니다.");
						break a;
					}
					for (int j = 0;true; j++) {
						
					System.out.println("재도전 Y or N :");
					retry = k.next();
					if (retry.equals("Y")) {
						break;
					}else if (retry.equals("N")) {
						break a;
					}else {
						System.err.println("부적절한 문자입니다.");
					}
					}
				}else if (userSum < comSum) {
					System.out.printf("컴퓨터의 눈의 합 : %d", comSum);
					System.out.println("＊패배＊");
					money -= betMoney;
					lose++;
					userSum = 0;
					comSum = 0;
					System.out.printf("현재 소지금 : %d원\n", money);
					if (money == 0) {
						System.out.println("돈이 없습니다.");
						break a;
					}
					for (int j = 0; true; j++) {
						
					System.out.println("재도전 Y or N :");
					retry = k.next();
					if (retry.equals("Y")) {
						break;
					}else if (retry.equals("N")) {
						break a;
					}else {
						System.err.println("부적절한 문자입니다.");
					}
					}
				}else {
					System.out.println("□무승부□");
					draw ++;
					userSum = 0;
					comSum = 0;
					System.out.printf("현재 소지금 : %d원\n", money);
					for (int j = 0;true; j++) {
						
					System.out.println("재도전 Y or N :");
					retry = k.next();
					if (retry.equals("Y")) {
						break;
					}else if (retry.equals("N")) {
						break a;
					}else {
						System.err.println("부절적한 문자입니다.");
					}
					}
				}
				}
			
				
			}else if (menu == 2) {
				{
					System.out.println("전적확인");
					System.out.printf("%d승 %d무 %d패 \n"
							+ "소지금 : %d원\n", wins, draw, lose, money);
				}
			}else if (menu == 3) {
			d :	for (int i = 0; true; i++) {
					System.out.print("원하는 대출액 :");
					borrowMoney = k.nextInt();
					if (borrowMoney < 0) {
						System.err.println("부적절한 금액입니다.");
						for (int j = 0;true; j++) {
							
						System.out.print("대출을 더 원하시면 1번 \n그만 하시겠다면 2번을 누르세요 : ");
						stop = k.nextInt();
						if (stop == 1) {
							break;
						}else if (stop == 2) {
							break d;
						}else
							System.err.println("부적절한 번호입니다.");
						}
						
					}else {
						
					money += borrowMoney;
					accumulateLoan += borrowMoney;
					System.out.printf("현재 대출액 : %d\n", accumulateLoan);
					System.out.printf("현재 소지금 : %d\n", money);
						for (int j = 0; true; j++) {
							
					System.out.print("대출을 더 원하시면 1번 \n그만 하시겠다면 2번을 누르세요 : ");
					stop = k.nextInt();
					if (stop == 1) {
						break;
					}else if (stop == 2) {
						break d;
					}else {
						System.err.println("부적절한 번호입니다.");
					}
						}
					}
					
				}
			}else if (menu == 4) {
			e :	for (int i = 0; true; i++) {
					System.out.printf("현재 상환해야할 금액 : %d\n",accumulateLoan);
					System.out.print("원하는 상환액 :");
					repayMoney = k.nextInt();
					if (accumulateLoan< repayMoney) {
						System.out.println("상환할 금액이 넘습니다.");
						System.out.printf("현재 소지금 : %d\n", money);
						for (int j = 0;true; j++) {
							
						System.out.print("상환을 더 원하시면 1번 \n그만 하시겠다면 2번을 누르세요 : ");
						stop = k.nextInt();
						if (stop == 1) {
							break;
						}else if (stop == 2) {
							break e;
						}else {
							System.err.println("부적절한 번호입니다.");
						}
						}
						
					}else {
						
					money -= repayMoney;
					accumulateLoan-= repayMoney;
					System.out.printf("상환해야할 금액 : %d\n",accumulateLoan);
					System.out.printf("현재 소지금 : %d\n", money);
					for (int j = 0; true; j++) {
						
					System.out.print("상환을 더 원하시면 1번 \n그만 하시겠다면 2번을 누르세요 : ");
					stop = k.nextInt();
					if (stop == 1) {
						break;
					}else if (stop == 2) {
						break e;
					}else {
						System.err.println("부적절한 번호입니다.");
					}
					}
					}
					
				}
			}else if (menu == 5) {
				System.out.println("프로그램이 종료됩니다.");
				System.out.println("=======================================");
				break b;
			}else {
				System.err.println("해당되는 번호가 없습니다. 다시 입력해 주십시오.");
			}
		}
	
	}

}



















