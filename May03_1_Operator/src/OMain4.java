import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// 이름을 입력을 받을거에요!
		// 그 이름이 '홍길동'이랑 같은지 true/ false
		Scanner k= new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String name = k.next();
		System.out.printf("이름:%s\n",name);
		boolean correctOrDeny = name =="홍길동";
		System.out.println(correctOrDeny);// => true ?
		
        // *** String 문자열이 같은지 비교		
		// 대상의 값 자체를 비교하기 위해서 .equals()를 사용!
		boolean b2 = name.equals("홍길동");
		System.out.println(b2);// => true !
		
		// shift : 옮기다, 이동하다
		// ( 10진수 << 정수 ) 의 형태
		// << : 앞에 있는 수(10진수)를 2진수로 바꾸고,
		// 뒤에 있는 수(정수)만큼 왼쪽으로 밀어라!
		// 비어있는(오른쪽) 칸 수를 0으로 채우고,
		// 2진수를 다시 10진수로 바꿔라!!
		
		// ex) 카페! (조건 검색)
		//     24시간 :  1 << 0 = 1
		//     와이파이 : 1 << 1 = 2
		//     흡연실 : 1 << 2 = 4 
		//     주차장 : 1 << 3 = 8
		
		int c = (150 << 6);
		System.out.println(c);
		
		
		// <연산자>
		//    ●단항 연산자 : a++, a--, !a, ...
		//    ●이항 연산자 : a + b, a > b, ...
		//    ●삼항 연산자 : 
		//           조건을 따져서 값을 대입할 때 사용
		//           if문으로 대체가 가능함
		//           문법이 길어짐
		//  조건식 
		//  [?]: 조건을 만족할 때 쓸 값 
		//  [:]: 조건불성립시 쓸 값
		
		// 나이 값도 입력받아서 
		// 나이가 20살 이상이면 '안녕하세요' 를 출력
		// 나이가 20살 미만이면 'NAGA!'를 출력
		
		System.out.print("나이:");
		int age = k.nextInt();
		String result = (age >= 20) ? "안녕하세요" : "NAGA!";  // ???
		System.out.println(result);
		
		// 홍길동씨 : 1강의장 
		// 나이가 짝수 : 1강의장
		// 나머지는 : 2강의장
		String result1 = age % 2 == 0||name.equals("홍길동") ?"1강의장" :"2강의장"; 
		System.out.println(result1);
		
		// 상자 하나에 야구공이 6개 들어갈 수 있습니다.
		// 공의 갯수를 입력받아서 
		// 공을 모두 담을 상자의 갯수가 몇 개인지 출력
		// ex) 공이 49개 => 상자는 9개
		
		System.out.print("공의 갯수:");
		int baseball = k.nextInt();
		int boxes = baseball % 6 == 0 ? baseball/6 : baseball/6 + 1;
		System.out.printf("상자 갯수:%d개\n",boxes);
		
		
		
		
		
		
		
	}

}
