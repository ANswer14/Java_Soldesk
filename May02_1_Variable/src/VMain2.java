
public class VMain2 {
	public static void main(String[] args)  {
		// 이름, 오늘 날짜 (연도.월.일), 사는 곳(지역), 시력, java경험의 유무
		// 를 변수에 담아서 출력
		String name = "LeeYoungHoon";
		int year = 2024;
		int month = 5;
		int day = 2;
		String habitat = "Gunpo Dangdong";
		double eyesight = 0.7;
		
//		String javaExperience = "almost 0";
		boolean javaExperience = false;
		System.out.printf("이름 : %s\n", name);
		System.out.printf("오늘 날짜 : %s년-%s월-%s일\n", year, month, day);
		System.out.printf("사는 곳 : %s\n", habitat);
		System.out.printf("시력 : %s\n", eyesight);
		System.out.printf("자바 경험의 유무 : %b\n", javaExperience);
		System.out.println("이름 : "+ name);
		System.out.printf("날짜 : %d-%02d-%d", year, month, day);
		System.out.println("사는 곳 "+ habitat);
		System.out.printf("시력 : %.1f\n", eyesight);
		
		// 섬유향수
		// 1000원
		// 80ml
		// 체리블라썸
		// 향균은 99.9%
		// 무색
		// in다이소
		// 재활용 해야함(T OR F)
		System.out.println("================");
		
		String stuffName = "섬유향수";
		int price = 1000;
		int volume = 80;
		String aroma = "Cherry Blossom";
		double power = 99.9;
		String color = "X";
		String enterprise ="Daiso";
		boolean recycle = true;
		
		System.out.println("물건 이름 \t\t: "+ stuffName);
		System.out.printf("물건 가격 \t\t: %d원\n", price);
		System.out.printf("물건 용량 \t\t: %dml\n", volume);
		System.out.println("향기 \t\t: "+ aroma);
		System.out.printf("살균력 \t\t: %.1f%%\n", power);
		System.out.println("색깔 \t\t: "+ color);
		System.out.println("기업 \t\t: "+ enterprise);
		System.out.println("재활용 유무 \t: "+ recycle);
		
		
	}

}
