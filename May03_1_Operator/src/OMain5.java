import java.util.Scanner;

public class OMain5 {
	public static void main(String[] args) {
		// 키(cm), 몸무게(kg)를 입력받아서
		//     => 비만도 검사 프로그램
		
		// 표준체중 = (키 - 100) x 0.9
		// 비만도 = (실제 체중 / 표준체중) x 100
		// 비만도가 120을 넘으면 "비만", 아니면 "안비만" 문구를 출력
		// 아무 키나 입력했을때 프로그램이 종료되게!
		
		
		Scanner k= new Scanner(System.in);
		System.out.print("키:");
		int height = k.nextInt();
		System.out.print("몸무게:");
		int weight = k.nextInt();
		String cor = weight/((height - 100) * 9/10) * 100 > 120 ? "비만" : "안비만";
		System.out.println(cor);
		System.out.println("아무키나 입력하면 종료됩니다.");
		String a = k.next();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
