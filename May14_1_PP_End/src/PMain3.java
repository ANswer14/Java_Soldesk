
public class PMain3 {
	// 정수 두개 넣으면 그 합을 출력하는 함수
	public static void printPlusTwoNum(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
	}
	// 정수 세개 넣으면 그 합을 출력하는 함수
	//  *** 오버로딩 : 본질이 같다면 굳이 함수의 이름을 다르게 할 필요 없다!
	public static void printPlusTwoNum(int x, int y, int z) {
		System.out.printf("%d + %d + %d = %d\n", x, y , z, x + y + z);
	}
	
	// 정수를 n개 넣으면 그 곱을 출력하는 함수 (파라미터가 몇 개인지 모름...)
	//         함수 파라미터로 갯수 무제한
	//             (자료형...변수명)
	public static void multipleNums(int...n) {
		int mul = 1;
		// 함수 내에서 사용할 때는 배열처럼!!
		for (int i = 0; i < n.length; i++) {
			mul *= n[i];
		}
		System.out.println(mul);
	}
	
	
	public static void main(String[] args) {
		printPlusTwoNum(1, 2);
		printPlusTwoNum(55, 4, 6);
		multipleNums(1,2,3,4,5,5,5,5);
	}

}
