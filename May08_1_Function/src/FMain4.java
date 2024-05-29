import java.util.Random;
import java.util.Scanner;

public class FMain4 {
	// 동전 맞추기 게임
	// 10개
	
	// 랜덤 숫자 구하기
	public static int randomNum() {
		return new Random().nextInt(10) + 1;
	}
	// 몇개 들고있는지 맞히기
	public static int userAns() {
	System.out.print("동전은 몇개 있을까 : "); 
	return new Scanner(System.in).nextInt();
	}
	// 컴퓨터가 숫자제시
	// 몇개 인지 비교
	public static String compareAns(int randomNum, int havingCoins) {
		return havingCoins == randomNum ? "정답" : "오답";
	}
	// 결과
	// 출력
	public static void printResult(int randomNum, int havingCoins, String compare) {
	    System.out.printf("내가 선택한 현재 갖고있는 동전 수 : %d\n", havingCoins);
	    System.out.printf("실제 갖고있는 동전 수 : %d\n", randomNum);
	    System.out.println("정답은? : "+compare);
	// 모으기
	}
	    public static void start() {
	int randomNum = randomNum();		
	int havingCoins = userAns();
	printResult(randomNum, havingCoins, compareAns(randomNum, havingCoins));
	    }
	public static void main(String[] args) {
		start();
	}    
	
	
	
	
	
	
	
	
	
	
	
	
	

}
