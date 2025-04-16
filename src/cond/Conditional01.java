package cond;

public class Conditional01 {

	public static void main(String[] args) {
		//조건 if문
		
		int num=5;
		if(num >10 ) {
			System.out.println("hello");
			System.out.println("num이 10보다 크다");
		}
		if(num <= 20) {
			System.out.println("20보다 작거나 같다.");
		}
		if(num != 5) //중괄호가 없으면 조건만 다음 1줄만 if문에 종속됨
			System.out.println("살펴봤더니");
		System.out.println("5는 아니더라"); //if문 범위에 들어가지 않음
		
		boolean b1 = (num == 5);
		
		//삼항연산자 (조건식) ? 참 : 거짓;
		if(b1 == true) { //조건문 if(조건식)
			System.out.println("num이 5다");
		}
		//변수의 범위 (지역변수)
		if(b1) {  //true이기 때문에 실행
			System.out.println("b1 조건문 내부" + num);
			
			int x =100;
			System.out.println("x = "+x);
		}
		int x = 100;
		System.out.println("x값 확인"+ x);
		
		System.out.println("프로그램 끝");
	}

}
