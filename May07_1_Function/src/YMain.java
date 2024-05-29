import java.util.Random;
import java.util.Scanner;

public class YMain {
	// 홀짝게임 만들기!
	//        동전 10개를 쥐고 있다가! => 섞어서 동전갯수 고름
	//        내가 '홀'이라고 하면..
	//        정답인지 아닌지 판정해서 그 결과를 출력해주는 프로그램
	public static void main(String[] args) {
//		Random r = new Random();
//		int i = r.nextInt();   // int범위안에 있는 랜덤한 정수
//		int i2 = r.nextInt(5); // 0 ~ 4 중 랜덤한 정수
//		int i3 = r.nextInt(5) + 1; // 1 ~ 5 중 랜덤한 정수
//		System.out.println(i);
//		System.out.println(i2);
//		System.out.println(i3);
		
		Scanner k = new Scanner(System.in);
		System.out.print("나의 홀 or 짝 (고르시오): ");
		String select = k.next();
		Random r =new Random();
		int a = r.nextInt(10) + 1;
		String com = a % 2 ==1 ? "홀" : "짝";
		String cor = select.equals(com)? "정답" : "오답";// .equals(문자열에 변수 넣기 가능)
		System.out.printf("컴퓨터가 뽑은수 : %d\n"
				+ "컴퓨터의 홀 or 짝 : %s\n"
				+ "나의 홀 or 짝 : %s\n", a, com, select);
		System.out.println("결과 : "+ cor);
 		
		
				
	}

}
