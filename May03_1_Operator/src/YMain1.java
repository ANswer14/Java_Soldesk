import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) throws InterruptedException {
		
		// 오늘 기분은 어떤가요?
		// 오늘 컨디션 점수는 ?
		// 대중교통 몇번 갈아타고 오셨는지 ?
		// 밤에 푹 주무셨는지 (잘 잤으면 true / 아니면 false)
		// 몇 시간 주무셨나요 ? (ex : 6.0시간 (실수))
		
		// Scanner로 입력을 받아서 출력까지 !
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("오늘 기분은 어떤가요? :");
		String mind = keyboard.next();
		System.out.print("오늘 컨디션 점수는 ? :");
		int condition = keyboard.nextInt();
		System.out.print("대중교통 몇 번 갈아타고 왔는지 ? :");
		int subway = keyboard.nextInt();
		System.out.print("밤에 푹 주무셨는지 :");
		boolean sleep = keyboard.nextBoolean();
		System.out.print("몇 시간 주무셨는지 :");
		double hours = keyboard.nextDouble();
		
		System.out.println("================");
		System.out.println("오늘 기분 : "+ mind);
		System.out.printf("오늘 컨디션 : %d\n", condition);
		System.out.printf("대중교통 환승 횟수 : %d번\n", subway);
		System.out.println("밤에 푹 잤는지 유무 : "+ sleep);
		System.out.printf("몇 시간 : %.1f시간\n", hours);
		System.out.println("================");
		
		Thread.sleep(10000);
		 
		
		
		
	}

}
