
public class PMain3 {
	public static void main(String[] args) {
		// print
		//System.out.print("1asdf");
		//System.out.print("2asdf");
		
		// printf (Formatting - 형식 지정)
		// System.out.printf("%??", 값); 의 형태
		
		// 정수 (decimal)
		// %d : 정수데이터가 들어올 자리(decimal, 10진수)
		// %x(숫자)d : 빈자리가 띄어쓰기로 채워져서 출력
		// %0xd : 빈자리를 0으로 채워서 x자리의 숫자로 만들어줌
		System.out.printf("%d\n", 1);
		System.out.printf("%3d\n", 1);
		System.out.printf("%010d\n", 1);
		System.out.println("---------------");
		
		// 실수 (float)
		// %f : 실수데이터가 들어올 자리
		// %.xf : 소수점 이하의 자릿수
		//         잘리는 부분은 반올림처리
		//         빈자리는 0으로 채워줌
		System.out.printf("%f\n", 123.456789);
		System.out.printf("%.3f\n", 123.456789);
		System.out.printf("%.10f\n", 123.456789);
		System.out.println("-------------------");
		

		// 문자열 (String)
		// %s : 글자데이터가 들어올 자리
		// 숫자 : 그냥 입력하면 됨
		// 문자 : 그냥 입력하게 되면 Java의 문법으로 해석하기에 
		//        =>오류가 발생
		//        => "내용" (큰 따옴표 안에 문자 넣기)
		System.out.printf("%s\n", "ㄴㅁㅇㄹ");
		System.out.println("------------------");
		
		
		// 오늘 날짜 기준으로 연도  => xxxx년
		//  월=> xx월
		//  일=> xx일
		// 연-월-일의 형태로 붙여서
		//  ex) 날짜 : xxxx-xx-xx
		// 날씨 : 더움
		// 기온 : 23도
		// 습도 : 20.21%
		System.out.println("------------------");
		System.out.printf("%s", "날짜: ");
		System.out.printf("%d", 2024);
		System.out.printf("%s", "년");
		System.out.printf("%d", 04);
		System.out.printf("%s", "월");
		System.out.printf("%d", 30);
		System.out.printf("%s\n", "일");
		System.out.printf("%s\n", "날씨: 더움");
		System.out.printf("%s", "기온: ");
		System.out.printf("%d", 23);
		System.out.printf("%s\n", "도");
		System.out.printf("%s", "습도: ");
		System.out.printf("%.2f", 20.21);
		System.out.printf("%s", "%");
		System.out.println("------------------");
		System.out.printf("%4d년", 2024);
		System.out.printf("%d월", 4);
		System.out.printf("%2d일\n", 30);
		System.out.println("---------------------");
		System.out.printf("날짜 : %4d-%02d-%2d\n", 2024, 4, 30);
		System.out.printf("날씨 : %s\n", "더움");
		System.out.printf("기온 : %2d도\n", 23);
		System.out.printf("습도 : %.2f%%\n", 20.21);
		System.out.printf("%02d", 2);
	}

}
