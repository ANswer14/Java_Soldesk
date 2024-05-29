
public class YMain {
	public static void main(String[] args) throws InterruptedException {
		// 학원오는데 얼마나 걸렸는지 (시간) : 1.5시간 
		// 어제 저녁 메뉴? : ???
		// 어제 뭐하셨나요 ? : ???
		// 취침 시간 : ?시 ?분
		// 첫 수업 소감 : ???
		// 수업 성취도 : ?.?%
		// 출력
	
		// => 5초 정도 딜레이 걸어서 => .bat로 실행까지!
		
		System.out.printf("%.1f 시간\n", 1.4);
		System.out.println("저녁 메뉴 : 고기");
		System.out.printf("어제 한 일 : %s\n", "게임");
		System.out.printf("취침 시간 : %d시\n", 12);
		System.out.println("첫 수업 소감 : 강사님이 설명을 흥미롭도록 해주셔서 집중이 잘 되었다");
		System.out.printf("수업 성취도 : %.1f%%", 60.6);
		
		Thread.sleep(5000);
		
		
	}

}
