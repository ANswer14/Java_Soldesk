import java.util.Random;
import java.util.Scanner;

public class PMain1 {
	public static void main(String[] args) {
		
		
		// 10개의 숫자를 랜덤으로 뽑아서 (1 ~ 100)
		// 배열에 담고 => 출력
		Random r = new Random();
		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = r.nextInt(100) + 1;
			System.out.printf("%d번째 숫자 : %d\n", i, num[i]);
		}
		
		// 10개의 숫자를 랜덤으로 뽑아서 (1 ~ 100)
		// 배열에 담고 => 출력
		// 10개의 숫자를 직접 입력해서
		// 배열에 담고 => 출력
		Scanner k = new Scanner(System.in);
		int[] num2 = new int[10];
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("%d번째 숫자 : ", i);
			num2[i] = k.nextInt();
			System.out.println();
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.printf("%d번째 숫자 : %d\n", i ,num2[i]);
		}
		// 10개의 숫자를 랜덤으로 뽑아서 (1 ~ 100)
		// 배열에 담고 => 출력
		// 10개의 숫자를 직접 입력해서
		// 배열에 담고 => 출력
		// 배열 (Random으로 받아온)의 최대값, 최소값 => 출력
		// 내가 한 방법
//		int t = 0;
//		
//		for (int i = 0; i < num.length; i++) {
//		
//		for (int j = 0; j < num.length - 1; j++) {
//			if (num[j] > num[j + 1]) {
//				t = num[j + 1];
//				num[j + 1] = num[j];
//				num[j] = t;
//				
//			}
//		}
//		}
//		System.out.printf("최댓값 : %d, 최솟값 : %d ", num[9], num[0]);
		// 강사님의 방법
		int min = num[0];   // 배열의 0번째 숫자가 최소값이라고 가정
		int max = num[0];   // 배열의 0번째 숫자가 최대값이라고 가정
		
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) { // min의 숫자보다 num[i]의 숫자가 더 작다면
				min = num[i];
			} else if (max < num[i]) { // max의 숫자보다 num[i]의 숫자가 더 크다면
				max = num[i];
			}
		}
		System.out.println("최소값 : "+ min);
		System.out.println("최대값 : "+ max);
		
		
		
		
	}

}
