import java.util.Scanner;

// 어떤 숫자를 콘솔창에 입력
//   그 숫자의 약수를 구해서 출력해주는 프로그램
// main 에서 진행 => 음수값은 무시
//  ex) 12의 약수는 : 1, 2, 3, 4, 6, 12
//  계속 입력하면 약수를 계속 출력해서 보여주고
//      => 콘솔창에 0을 입력하면 프로그램이 종료되게!
// 배열 사용 x

public class PMain1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int num = 1;
	a:	for (int u = 0; true; u++) {
		System.out.print("\n숫자 입력 : ");
		num = k.nextInt();
	    for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (num == 0) {
					System.out.println("종료합니다.");
					break a;
				}
				if (i * j == num) {
					System.out.printf("%d ", num / j);
				}
				
			}
	}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
