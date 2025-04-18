package Iter;

public class Iteration04 {

	public static void main(String[] args) {
		
//		반복문 중첩
//		for(int i=1; i<=3; i++) {
//			System.out.println("1");
//			
//			for(int j = 1; j<=4 ; j++) {
//				System.out.println("2");
//				
//				for(int k = 1; k<=3 ; k++) {
//					System.out.println("3");
//				}
//			}
//		}
		int i =1;
		while(i<=3) {
			System.out.println("1");
			
			
			int j= 1;
			while(j <=4) {
				System.out.println("222");
				j++;
			}
			i++;
		}
		System.out.println("==================================");
		for(int a=1; a<=3; a++) {
			System.out.println("1");
			
			for(int j = 1; j<=4 ; j++) {
				System.out.println("222");
				
				for(int k = 1; k<=3 ; k++) {
					System.out.println("33333");
				}
			}
		}
		System.out.println("==================================");
		
		for(int b=3; b>=1; b--) { //b : 1~3 방이 3개다.
			System.out.printf("%d번 방 청소 \n", b);
			
			int c=1;
			while(c<=2) {
				System.out.println("(1)빗자루");
				c++;	
			}
			for(int d =1; d<=3; d++) {
				System.out.println("(2)걸레");
			}
			System.out.println("(3)쓰레기 정리");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
