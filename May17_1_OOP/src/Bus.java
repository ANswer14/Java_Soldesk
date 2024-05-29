// function - 클래스 밖에 만든 것 - X (사실상 Java에는 function이라는 용어가 없음)
// method - Class 속에 만든 것 (Class에 종속적인 함수라고도 표현)
//        - 여태까지 써왔던건 다 method


public class Bus {
	
	int num;
	String carSort;
	String enterprise;
	String handlerName;
	String startingLocation;
	
	public void printInfo() {
		// this : 객체 자기 자신을 말한다 (this. : 생략 가능 O)
		System.out.println(this.num);
		System.out.println(carSort);
		System.out.println(enterprise);
		System.out.println(handlerName);
		System.out.println(startingLocation);
	}
	
	// method - 액션, 프로그램상 필요한 기능
	//           - 객체의 동작에 해당하는 실행 블록
	public void go() {
		System.out.println("부릉부릉 ~");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
