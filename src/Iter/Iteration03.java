package Iter;

public class Iteration03 {

	public static void main(String[] args) {

		int i= 1;
		
//		while(i<=10) {
//			System.out.println(i);
//			
//			
//			if(i ==5 )
//				break; //실행중인 반복문 끝내기
//			i++;
//		}
//		System.out.println("=================================================");
//		//무한 루프
//		int energy = 10;
//		while(true) {
//			System.out.println("달리기");
//			energy--;
//			if(energy == 0)
//				break;
//		}
//		
//		for(energy = 10; energy > 0; energy--) {
//			System.out.println("달리기");
//		}
		/*
		반복{
			멈춰야하는 사전 조건 확인(사전 필터링)
			
			if(조건)
				break;
			if(조건)
				break;
			if(조건)
				break;
			if(조건)
				break;
				
			실행
		}
		*/
		System.out.println("=================================================");

		for(i=1; i<=5; i++) {
			
			
			if(i==5 || i==8)
				continue;
				//break;
			
			System.out.println(i); //위치에 따라 결과값이 달라짐
		}
	}

}
