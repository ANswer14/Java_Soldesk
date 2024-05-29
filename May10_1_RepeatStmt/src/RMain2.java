

// 이중 for문 >> for문안에 for문 >> 중첩 for문


public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("i값 : %d -------------\n", i);
			for (int j = 1; j < 6; j++) {
				System.out.printf("j값 : %d\n", j);
			}
		}
		System.out.println("=====================");
		
		
		
		// 구구단 
		// <2단>
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 9 x 9 = 81
		System.out.println("==============");
		for (int i = 2; i <= 9; i++) {
			System.out.printf("<<< %d단 >>>\t", i);
		}
//			System.out.printf("구구단 : <%d단>\n", j);
		System.out.println();
		for (int j2 = 1; j2 < 10; j2++) {
			for (int j = 2; j < 10; j++) {
			     System.out.printf("%d x %d = %d\t", j, j2, j * j2);
		}
			     System.out.println();
		}
		
//		int one = 1;
//		int two = 2;
//		int three = 3;
//		int four = 4;
//		int five = 5;
//		int six = 6;
//		int seven = 7;
//		int eight = 8;
//		int nine = 9;
//		System.out.println("=====================");
//		for (int j = 2; j < 10; j++) {
//			System.out.printf("<%d단>\t\t", j);
//		}
//		System.out.println("");
//		for (int j3 = 2; j3 < 10; j3++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j3, two, j3 * two);
//			}
//		System.out.println("");
//		for (int j4 = 2; j4 < 10; j4++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j4, three, j4 * three);
//		}
//		System.out.println("");
//		for (int j5 = 2; j5 < 10; j5++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j5, four, j5 * four);
//		}
//		System.out.println("");
//		for (int j6 = 2; j6 < 10; j6++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j6, five, j6 * five);
//		}
//		System.out.println("");
//		for (int j7 = 2; j7 < 10; j7++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j7, six, j7 * six);
//		}
//		System.out.println("");
//		for (int j8 = 2; j8 < 10; j8++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j8, seven, j8 * seven);
//		}
//		System.out.println("");
//		for (int j9 = 2; j9 < 10; j9++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j9, eight, j9 * eight);
//		}
//		System.out.println("");
//		for (int j10 = 2; j10 < 10; j10++) {
//			System.out.printf("%d * %d = %d\0\0\0\0\0\0\0", j10, nine, j10 * nine);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
    
}
