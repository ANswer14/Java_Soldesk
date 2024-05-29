import java.util.Scanner;

public class KIMain1 {
	public static void main(String[] args) throws InterruptedException {
		// Scanner : Java에 내장되어있는 기능 중 하나!
		// 이 기능을 사용하기 위해서 'import'라는 것이 사용됨
		// 이 Scanner라는걸 사용하려면 조건이 하나 필요한데...
		// new ~~~ : 객체
		
		//Scanner는 화면(이클립스의 콘솔창)으로부터
		//        데이터를 입력 받는 기능
		
		
		Scanner keyboard = new Scanner(System.in);//  in은 입력, out은 출력
//		System.out.println();
	
		// 이름을 콘솔창에 입력받아서 출력
		System.out.print("이름 : ");
		String name = keyboard.next();
		
		// 키, 몸무게, 신발 사이즈, 여행가고싶은곳, 좋아하는 숫자, 퇴근하고싶은지 유무
		// 를 입력받고 변수에 담아서 출력!
		System.out.print("키 : ");
		int height = keyboard.nextInt();
		System.out.print("몸무게 : ");
		int weight = keyboard.nextInt();
		System.out.print("신발 사이즈 : ");
		int shoe = keyboard.nextInt();
		System.out.print("여행가고싶은곳 : ");
		String trip = keyboard.next();
		System.out.print("좋아하는 숫자 : ");
		int num = keyboard.nextInt();
		System.out.print("퇴근하고싶은지 유무 : ");
		boolean goHome = keyboard.nextBoolean();
		System.out.println("=================");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("키 : %d\n", height);
		System.out.printf("몸무게 : %d\n", weight);
		System.out.printf("신발 사이즈 : %d\n", shoe);
		System.out.printf("여행가고싶은곳 : %s\n", trip);
		System.out.printf("좋아하는 숫자 : %d\n", num);
		System.out.printf("퇴근하고싶은지 유무 : %b\n", goHome);
		System.out.println("=================");
		// bat파일 생성 =>
		// '끄고 싶으명 아무거나 입력하세요 : '
		// 뭔가를 입력해서 엔터치면 
		// 1초마다 .이 나온 후 (3번)
		// '프로그램을 종료합니다'라는 메시지가 출력되고
		// 0.5초 후에 프로그램이 종료
		System.out.print("끄고 싶으면 아무거나 입력하세요 :");
		String input = keyboard.next();
		
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		System.out.println("프로그램을 종료합니다");
		Thread.sleep(500);
		//keyboard.close(); 있어도 되고 없어도 되는
		keyboard.close();
		
		
		
		
		
	}

}
