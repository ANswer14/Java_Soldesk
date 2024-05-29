import java.util.Random;
import java.util.Scanner;

public class PMain1 {
	// 베스킨라빈스 31게임!
	// 유저 먼저 시작! (1 ~ 3 사이 정수)
	// main함수에 
	public static void main(String[] args) {
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		int comNum = 0;
		int userNum = 0;
		int numSum = 0;
		int select = 0;
		int wins = 0;
		int loses = 0;
  b:    while (true) {
	  System.out.println("============================");
	  System.out.println("<<< Game Strart >>>");
	  System.out.println("1. Game Strart ");
	  System.out.println("2. Game Score ");
	  System.out.println("3. Game Stop ");
	  System.out.print("선택>");
	  select = k.nextInt();
	  switch (select) {
	  case 1: 
     a :while (true) {
    	 System.out.println("베스킨라빈스 31 시작!");
		  while (true) {
			
			System.out.print("<your turn>\n1 ~ 3 사이의 정수를 고르시오> ");
			userNum = k.nextInt();
			if (userNum < 1 || userNum > 3) {
				System.out.println();
				System.err.println("잘못 입력하였습니다.\n다시 입력하십시오.");
				userNum = 0;
				break;
			}
			numSum += userNum;
			if (numSum >= 31) {
				System.out.println(numSum+ "!!!");
				System.out.println("패배!");
				loses ++;
				break a;
			}
			System.out.println("현재 총 합 : " +numSum);
			System.out.println("<com turn>");
			comNum = r.nextInt(3) + 1;
			System.out.println("컴퓨터가 고른 수 : "+ comNum);
			numSum += comNum;
			System.out.println("현재 총 합 : " +numSum);
			if (numSum >= 31) {
				System.out.println(numSum+ "!!!");
				System.out.println("승리!");
				wins ++;
				break a;
			}
		  }
	  }
                break;
			case 2: 
				System.out.printf("<%d 승 %d 패>\n", wins, loses);
				break;
			case 3:
				System.out.println("프로그램 종료");
				break b;
			default:
				System.err.println("부적절한 번호입니다.\n다시 입력해 주십시오.");
        }	
      }
  
  
  
  
  
  
  
  
  
  
  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
