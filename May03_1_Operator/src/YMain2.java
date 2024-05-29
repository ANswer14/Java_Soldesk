import java.util.Scanner;


public class YMain2 {
	public static void main(String[] args) throws InterruptedException {
		// 국어, 수학, 영어 점수를 각각 입력받아서 출력
		// + 총점과 평균점수까지 출력
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("국어 점수:");
		int hangeul = keyboard.nextInt();
		System.out.print("수학 점수:");
		int math = keyboard.nextInt();
		System.out.print("영어 점수:");
		int english = keyboard.nextInt();
		
		System.out.println("=============");
		System.out.printf("국어 점수:%d\n", hangeul);	
		System.out.printf("수학 점수:%d\n", math);	
		System.out.printf("영어 점수:%d\n", english);
		System.out.println("총점 : "+(hangeul + math + english));
		System.out.printf("평균 :%.1f\n ",
				(double) (hangeul + math + english)/3);
		
		Thread.sleep(5000);
		// int/int = int  (in Java)
		
		
		System.out.println(4/5);
		
		
		
		
		
		
		
		
		
		
	}
	

}
