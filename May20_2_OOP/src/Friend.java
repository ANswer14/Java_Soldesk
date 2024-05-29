import java.util.Scanner;

public class Friend {
	Scanner pen = new Scanner(System.in);
String name = "아무개";	
int answer;
//친구가 답을 적어서 제출
public void printAnswer() {
	while (true) {
		
		 answer = pen.nextInt();
		 if (answer < 1 || answer > 100) {
			System.out.println("'부적절한 번호이다 다시 생각해보자.'");
		}else {
			break;
		}
		 
		}
		System.out.printf("'제 답은 %d입니다.'\n", answer);
	}
}



