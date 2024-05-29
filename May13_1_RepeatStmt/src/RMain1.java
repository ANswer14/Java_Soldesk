import java.util.Random;
import java.util.Scanner;

public class RMain1 {
	
	// Up & Down 게임 (main에)
	// 1 ~ 100 사이의 숫자
	// 컴퓨터 vs 나 => 같은 숫자내면 종료
	//    숫자가 나보다 낮으면 Down!
	//    숫자가 나보다 높으면 Up!
	//    몇 턴만에 정답을 찾았는지 출력	
	public static void main(String[] args) {
		Random r = new Random();
		int randomNum = r.nextInt(100) + 1;
		Scanner k = new Scanner(System.in);
		int myNum = 1;
		for (int i = 1; true; i++) { // 몇 번 반복할지 모르기 때문에
			                         // 조건을 지정할 수 없음
			                         // true로 자리를 메워줌  => 항상 참이니 계속 진행
			System.out.print("숫자를 입력하시오 : ");
			myNum = k.nextInt();
			System.out.printf("내가 입력한 수 : %d\n", myNum);
			if (myNum == randomNum) {
				System.out.println("정답!");
				System.out.printf("정답을 맞추는데 걸린 횟수 : %d회\n", i);
				break;      // 반복문을 깨버림
			}else if (myNum > randomNum) {
				System.out.println("Down!");
			}else {
				System.out.println("Up!");
			} 
		}
	}

}
