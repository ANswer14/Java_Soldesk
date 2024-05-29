import java.util.Iterator;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

// 여태까지 했던 것 - 문과적인 요소...!
// 반복문 - 이과적 요소...! => 어려워요...

public class RMain1 {
	public static void main(String[] args) {
		// ㅎ 출력
		// ㅎ 5번 출력
		// ㅎ 17832번 출력
		System.out.println("ㅎ");
		System.out.println("ㅎ");
		System.out.println("ㅎ");
		System.out.println("ㅎ");
		System.out.println("ㅎ");
		
		// 1. 어떤 작업을 17832번 반복 (횟수)
		// 2. 어떤 작업을 퇴실시간까지 반복(기한)
		
//			for (변수초기화; 조건식; 값의 증감) { 
//		          (1. 변수초기화) (2.조건식이 맞으면(참))  ( 4. 값의 증감)
//		          (5. 다시 조건을 비교) (7. 다시 값의 증감)
//		          (8. 조건 비교후 안맞으면(거짓))
//				반복할 내용 (3. 내용 실행) (6. 다시 내용 실행) (9.반복문 종료)
//			}
		// ㅎ을 3번 출력
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ㅎ\n", i);
		}
		System.out.println("==============");
		
		// 5부터 1까지 순서대로 내림차순으로 출력
		for (int i = 5; i > 0 ; i--) {
			System.out.println(i);
		}
		System.out.println("==============");
		
		// 1, 3, 5, ..., 21까지 출력
		for (int i = 1; i < 22; i+=2) {
			System.out.println(i);
		}
		System.out.println("==============");
		
		//반복문이 5번 도는 동안에 1 ~ 10 사이의 정수를 랜덤하게 뽑고 싶을 때?
		for (int i = 1; i < 6; i++) {
			Random r= new Random();
			int randomNum = r.nextInt(10) + 1;
			System.out.println("랜덤하게 뽑은 수 : "+randomNum);
		}
		System.out.println("==============");
		
		Random r= new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt());
		}
		// 반복문 안에서 변수를 새로 만드는 것은 자제하는게 좋음!
		// 반복문이 한 번 돌때마다 변수 새로 생성
		// 반복문 밖에서 변수 하나 만들어서 갖다 쓰는게 조금 더 효율적!
		System.out.println("==============");
		int x = 0;
		for (int i = 0; i < 5; i++) {
			x = r.nextInt(10)+1; // 변수를 생성(X) / 변수의 값을 변경(O)
			System.out.println(x);
		}
		System.out.println("==============");
		
		// 1 + 2 + 3 + ... + 10 더한 값 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;  // sum = sum + i;    **가장 힘들어한 부분
		}
		System.out.println(sum);
		System.out.println("==============");
		// 팩토리얼 !  7! => ? 출력 => 7 * 6* 5 * 4 * 3 * 2 * 1
		int result = 1;
		for (int i = 1; i <= 7; i++) {
			result *= i;
		}
		System.out.println(result);
		
		System.out.println("==============");
		
		// 1 ~ 50 까지 정수 중에
		// 3의 배수거나, 5의 배수인 숫자를 다 더한 값을 출력    
		int sum2 = 0;
		for (int i = 1; i <= 50; i++) {
//			if (i % 3 == 0) {
//			sum2 += i;
//			} else if (i % 5 == 0) {
//				sum2 += i;
			if (i % 3 == 0 || i % 5 == 0) {
				sum2 += i;
			}
		}
			
		System.out.println(sum2);
		System.out.println("==============");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
	}

