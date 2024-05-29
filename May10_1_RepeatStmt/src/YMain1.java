import java.util.Scanner;

// 평일 스케쥴 출력해주는 프로그램

// 시간을 입력받아서 (24시간단위) => 해당시간에 속하는 내용을 출력
//     => (입력한 시간이) 시간 범위가 아니면 다시 입력

// 오전 9시 ~ 오후 6시 : 학원에서 공부           9~18
// 오전 9시, 오후 2시, 오후 6시 : QR찍기       9, 14, 18
// 오후 1시 ~ 오후 2시 전까지: 점심시간         13 ~ < 14
// 오후 6시 넘어서 ~ 오후 8시 : 집에 가는 시간      < 18 ~ 20
// 오전 6시 ~ 오전 9시 전까지 : 기상 + 씻기 + 학원가기 6 ~ < 9
// 오후 8시 ~ 오전 6시 전까지 : 여가시간 + 취침       20 ~ < 6
public class YMain1 {
	//시간 입력받기
	public static int getHour() {
		Scanner k = new Scanner(System.in);
		System.out.print("시간 : ");
		int hour = k.nextInt();
		if (!(hour >= 0 && hour <=23)) {
			System.err.printf("02d시는 없습니다. 다시 입력하세요.\n", hour);
		}
		return (hour >= 0  && hour <= 23) ? hour : getHour();
	}
	// if문으로 시간대별로 나누기
	public static void getWorks(int h) {
		if (h >= 9 && h <= 18) {
			System.out.println("학원에서 공부를 합니다.");
			if (h == 9 || h == 14 || h == 18) {
				System.out.println("QR!!");
			} else if (h >= 13 && h < 14) {
				System.out.println("점심밥");
			}
		} else if (h > 18 && h <= 20) {
			System.out.println("침대가 기다려요 !!!!");
		} else if (h >= 6 && h <9) {
			System.out.println("일어나기 + 씻기 + 학원가기");
		} else {
			System.out.println("여가시간 + 취침");
		}
	}
//		String works = "abc";
//		if (9 <= h && h <= 18) {
//					if (h == 9 || h == 14 || h == 18) {
//						works = "QR찍기";
//					} else if (13 <= h && h < 14) {
//						works = "점심시간";
//					}else {
//						works = "학원에서 공부";
//					}
//		} else if (18 < h && h <= 20) {
//			if (h == 20) {
//				works = "집에 가는 시간 + 여가시간 + 취침";
//			}else {
//				works = "집에 가는 시간";
//			}
//		} else if (6 <= h && h < 9) {
//			works = "기상 + 씻기 + 학원가기";
//		} else if (20 < h && h < 6) {
//			works = "여가시간 + 취침";
//		} else {
//			return getWorks(getHour());
//		} return works;       
	//main함수
	public static void main(String[] args) {
//		int hour = getHour();
//		System.out.println("할 일 : "+getWorks(hour));
		int hour = getHour();
		getWorks(hour);
	}
	}
	 
	
 

 























