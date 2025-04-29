package cls.cls01;

public class Calculator {
	//계산기라는 객체를 생성하기 위한 클래스


	//필드
	String brand;

	//생성자


	//메소드 (동작 / 기능)

	/*
	 	리턴 		매개변수
	 	o		o
	 	o		x
	 	x 		o
	 	x		x

	 리턴x : void
	 리턴o : 리턴할 타입
	 */

	//리턴x 매개변수x
	void powerOn(/*매개변수 없는 메소드*/){
		System.out.println("Power On");
	}

	//리턴x 매개변수o

	//원하는 밝기 수치를 받아서 밝기 조절기능 메소드
	//밝기는 : 1~10 가정
	void setBrightness(int bright) {
		System.out.println("밝기 수치" + bright + "로 조정합니다.");
	}

	String getInfo() {

		String s = "전자 계산기";
		return s;
		//String s = "전자 계산기"
	}
	//리턴O 매개변수O
	int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
//	int sum2(double x, double y) {
//		return  x +y;
//		return result;
//	}
	
	int sumArr(int[] arr) {

		int sum = 0;
		for(int i=0; i< arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}

