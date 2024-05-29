import java.util.Scanner;

// BMI 검사 프로그램 (함수.ver)

// 이름, 키(cm), 몸무게(kg) 입력
// BMI(체질량지수) : 몸무게 ? (키 * 키) => 키의 단위 : m
//  18.5미만이면 저체중
//  18.5이상이면 정상
//  25이상이면 과체중
//  30이상이면 경도비만
//  35이상이면 중증도비만
//  40이상이면 고도비만
//  결과를 출력 (각 결과에 따른 코멘트 작성)하고, 
//  Y를 입력하면 프로그램이 종료


public class CMain8 {
		// 이름 입력해서 얻기
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		return name;
	}
	// 키 입력해서 얻기
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키 : " );
		double height = k.nextInt();
		return height;
	}
	// 몸무게 입력해서 얻기
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("체중 : ");
		double weight = k.nextInt();
		return weight;
	}
	// BMI계산
	public static double calcBmi(double a, double b) {
		double bmi = b/(a*a/10000);
		return bmi;
	}
	// BMI 비만 판단
	public static String judgeBmi(double x) {
		if (x < 18.5) {
			return "저체중";
		} else if (x < 25) {
			return "정상";
		} else if (x < 30) {
			return "과체중";
		} else if (x < 35) {
			return "경도비만";
		} else if (x < 40) {
			return "중증도비만";
		} else {
			return "고도비만";
		}
	}
	// 결과 프린트
	public static void printResult(String name, double height, double weight, 
			double bmi, String judgement) {
		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println("잠시 후 결과가 나옵니다.");
			Thread.sleep(3000);
			System.out.printf("이름 \t: %s\n"
					+ "신장 \t: %.1fcm\n"
					+ "몸무게 \t: %.1fkg\n"
					+ "bmi지수 \t: %.1f\n"
					+ "현 상태 \t: %s\n", name, height, weight, bmi, judgement);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			switch (judgement) {
			case"저체중":
				System.out.println("하루에 5끼 챙겨드세요");
				break;
			case"정상":
				System.out.println("드시던대로 드세요");
				break;
			case"과체중":
				System.out.println("먹는 양을 줄이시는게 어떨까요 ?");
				break;
			case"경도비만":
				System.out.println("하루에 2끼만 드세요");
				break;
			case"중증도비만":
				System.out.println("하루에 1끼만 드세요");
				break;
			case"고도비만":
				System.out.println("며칠 안먹는다고 안죽습니다.");
				break;
			default:
				break;

			}
	}
	// 함수들 모으기
	public static void start() {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double bmi = calcBmi(height, weight);
		String judgement = judgeBmi(bmi);
		printResult(name, height, weight, bmi, judgement);
		
	}
	// 프로그램 종료
	public static String exit() {
		Scanner k = new Scanner(System.in);
		System.out.print("Y를 입력하시면 프로그램이 종료됩니다:");
		String exit = k.next();
//		String result = exit.equals("Y") ? "프로그램 종료" : exit();
		if (exit.equals("Y")) {
			System.out.println("프로그램 종료");
		} else {
			exit();
		}
//		return result;
		return exit;
	}
	//Main
	public static void main(String[] args) {
		start();
		exit();
	}
	
	


}































