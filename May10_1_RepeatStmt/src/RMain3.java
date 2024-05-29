public class RMain3 {
	public static void main(String[] args) {
		// 별찍기
		
		//ㅋ
		//ㅋㅋ
		//ㅋㅋㅋ
		//ㅋㅋㅋㅋ
		//ㅋㅋㅋㅋㅋ
//		String a = "ㅋ";
//		for (int i = 0; i < 5; i++) {
//			if (i == 0) {
//				System.out.println(a);
//			}else if (i == 1) {
//				System.out.println(a + a);
//			}else if (i == 2) {
//				System.out.println(a + a + a);
//			}else if (i == 3) {
//				System.out.println(a + a + a + a);
//			}else if (i == 4) {
//				System.out.println(a + a + a + a + a);
//			}
//		}
		
//		String a = "ㅋ";
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("ㅋ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// ㅋ
		//  ㅋ
		//   ㅋ
		//    ㅋ
		//     ㅋ
		//1번째 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==i) {
					System.out.print(" ㅋ");
				}else {
					System.out.print("  ");
				}	
			}System.out.println();
		}
		
		
	
	
	
	// 2번째 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  "); //j가 i보다 작은 공간은 띄어쓰기로 메꿔줌
			}
			System.out.println("ㅋ");
		}
		
	// 내가 한 방법	
		for (int j = 0; j < 5; j++) {
			System.out.println(" ㅋ");
			for (int i = -1; i != j; i++) {
				System.out.print("\0\0");
				
			}
		}
		
		// 3번째 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i==j) ? "ㅋ": "  ");
			}
			System.out.println();
		}
		
		
		
		
		// ㅋㅋㅋㅋㅋ
		// ㅎㅎㅎㅎ
		// ㅋㅋㅋ
		// ㅎㅎ
		// ㅋ
		for (int i = 0; i > - 5; i--) {
			for (int j = 0; j < i + 5; j++) {
				if (i % 2 == - 1) {
					System.out.print("ㅎ");
				}else if (i % 2 == 0) {
					System.out.print("ㅋ");
				} 
			}System.out.println();
		}
		
		
		
		
		
		System.out.println("=============");
		//내 방법
		for (int i = 5; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				if (i % 2 == 1) {
					System.out.print("ㅋ");
				}else {
					System.out.print("ㅎ");
				}
			}
			System.out.println();
			
		}
		System.out.println("=============");
		// 강사님의 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print(i % 2 == 0 ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		System.out.println("=============");
		
		// ㅋ
		// ㅎㅎㅎ
		// ㅋㅋㅋㅋㅋ
		// ㅎㅎㅎㅎㅎㅎㅎ
		// ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 2 * i ; j++) {
				if (i % 2 == 1) {
					System.out.print("ㅋ");
				}else {
					System.out.print("ㅎ");
				}
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		
		// 내가 한 방법
		for (int i = 0; i < 5; i++) {
			for (int j2 = 0; j2 < 5 - i; j2++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 2*i ; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		// 다른 분이 한 방법
		System.out.println("==================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 6); j++) {
				System.out.print(i + j >= 5 ? "*" : " ");
			}
			System.out.println();
		}
		System.out.println("==================");
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	


