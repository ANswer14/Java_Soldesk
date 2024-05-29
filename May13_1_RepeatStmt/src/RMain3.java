import java.util.Scanner;

public class RMain3 {
	public static void main(String[] args) {
		// 반복문 10번 => 반복문 1번 돌때마다 안녕하세요 x 3번씩 출력
		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				continue;
			}
			System.out.println(i);
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
			System.out.println("안녕하세요");
		}
		System.out.println("----------------");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("와 !");
			} else {
//				continue;    // => 턴 종료 -> 홀수일때는 무시하고, 다음으로 넘어감
//				break;       // (공식적), 반복문 끝 !
//				return;      // (비공식적), 메소드가 끝, 어쨋든간에 반복문이 깨짐
			}
		}
		System.out.println("----------------");
		// 코멘트 내용을 입력 받을건데, 내용은 계속 받아올 것 + 출력
		// 내용이 "ㅎㅇ"면 반복문 끝!
		Scanner k = new Scanner(System.in);
		String a = null;  //  null : 기본값(아무것도 들어있지 않은 값 
//		=> 이상태로 비교하면 에러뜸)
//		for (int i = 0; true; i++) {
//			System.out.print("글자 입력 : ");
//			a = k.next();
//			System.out.println(a);
//			if (a.equals("ㅎㅇ")) {
//		        System.out.println("반복문 끝!");
//				break;
//			}
//		}
		while (!a.equals("ㅎㅇ")) {
			System.out.print("내용 : ");
			a = k.next();
			System.out.println("--------------");
			System.out.println(a);
			System.out.println("--------------");
		}
		System.out.println("반복문 끝!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
