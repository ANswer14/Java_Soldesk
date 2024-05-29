// 재귀적 호출 (recursive call)
//  함수 속에서 자기 자신(이 함수)를 또 호출 => 반복

// 함수를 호출한다 : 비교적 느린 작업

// 반복문 : ex) 'for'

// 기업에서 테스트할 때 이걸 활용한 알고리즘을 문제로 내는 경우가 있음
public class FMain5 {

	// 등차수열 
	// 정수를 하나 넣으면 
	// 1 + 2 + 3 + 4 + ... + 그 숫자까지
	// 다 더한 값을 구해주는 함수
	public static int add(int x) {
		int answer = (x == 1) ? 1 : x + add(x-1);
		return answer;
		}
	
	// 정수를 하나 넣으면 팩토리얼값 구하는 함수
	// ex) 6! = 72  
	// 1! = 1,
//	2! = 1 * 2 = 2
//	3! = 1 * 2 * 3 = 6
//	an = 1 * 2 * ... * n-1 * n
	public static int factorial(int x) {
		int answer = (x == 1) ? 1 : x * factorial(x - 1);
		return answer;
	}
	
	// 피보나치 수열 
	// 1, 1, 2, 3, 5, ..
	//  정수를 하나 넣으면 해당 위치에 나올 숫자값 구해
	// a3 = a1 + a2
//	a4 = a3 + a2 = a1 + a2 + a2
//	a5 = a4 + a3 = a3 + a3 + a2 = a2 + a2 + a2 + a1 + a1
	public static int fibonachi(int x) {
		int answer = x == 1 || x == 2 ? 1 : fibonachi(x - 1) 
				+ fibonachi(x - 2);
		return answer;
	}
	
	// 수 하나를 넣어서 각 자릿수의 숫자를 더한 값을 구하는 함수
	// 123 = 1 + 2 + 3 = 6
//	189 = 100 + 80 + 9 = 18
//	1378 = 1 + 3 + 7 + 8 = 19

	public static int digitsum(int x) {
		int answer = x < 10 ? x : x % 10 + digitsum(x / 10);
		return answer;
	}
//	an = an+1 + an-1  => an+1 = an - an-1
//	a1 = 1
//	a2 = 1
//	a3 = 1 -1 = 0
//	a4 = -1
//	a5 = -1
//	a6 = 0
	public static int abc(int x) {
		int answer = x < 3 ? 1 : abc(x - 1) - abc(x - 2);
		return answer;
	}
	public static void main(String[] args) {
		int a = add(3);
		System.out.println(a);
		int f = factorial(5);
		System.out.println(f);
		int f2 = fibonachi(10);
		System.out.println(f2);
		int d = digitsum(189);
		System.out.println(d);
		int abc = abc(6);
		System.out.println(abc);
		
	}
}