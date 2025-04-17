package Iter;

public class Iteration01 {

	public static void main(String[] args) {
		
//		
//		//반복문
//		/*
//		for(초기화;조건식;증감식){
//			실행문
//		}
//		*/
//		System.out.println("======for문======");
//		for(int i=1; i<=10; i++) {  //for문 안의int i=1;는 지역변수
//			System.out.println("안녕하세요");
//		}
//		// 
//		int i=1; 
//		for(i=7; i != 13; i=i+1) {
//			System.out.println("반갑습니다.");
//		}
//		//실제 반복되는 값을 실행에 활용하는 용도	
		
		//7번 반복할 용대 숫자는 상관없지만 
		//필요한 숫자는 꼭 1~7까지 사용해야한다.
		for(int j=1; j <=7 ; ++j) {  //j는 변수 반복문에 의해 변할 수 있음 1~7
			System.out.println("자바 복습" + j +"일차");
		}
		System.out.println("=====================");
		//for문을 사용하여 1부터 50까지의 합 구하기
		int num =0;
		for(int k=1; k<=50;k++) {
			num += k;  // --> num =num + k; 와 같다.
		}
		
		System.out.println(num);
		
		System.out.println("========가우스 공식=============");
		
		int g = 50;
		int sum = g*(g+1)/2;
		System.out.println(sum);
		
		System.out.println("=====================");
		//k : 2   4   8   16
		// k < 20
		for(int k=2; k<20; k=k*2) {
			System.out.println(k);
		}
		System.out.println("=====================");
		for(int k =400; 100 < k ; k=k-50) {
			System.out.printf("%d\n",k); //printf는 줄내림시 [역슬래시(\) + n]
		}
		
		System.out.println("=====================");
		for(int k =100; 90 <= k ; k--) {
			System.out.printf("%d\n ",k);
		}
		
		
		
		
		
		
	}

}
