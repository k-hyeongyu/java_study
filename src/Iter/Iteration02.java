package Iter;

public class Iteration02 {

	public static void main(String[] args) {
		// 반복문 while 특정값이 true면 진행하고 false가 나오때 진행 종료
		// while(조건식){}

		int i =1;
		while(i<=5){
			System.out.println("졸림");
			
			i++; //증감식  i를 n회 반복용으로 사용함
		}
		System.out.println("=================================");
		//1부터 5까지 출력
		i =1; //i를 1로 초기화 위의 while문을 수행하고 현재의 i값은 6이 되어있음으로
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("=================================");
		i =0; //i를 1로 초기화 위의 while문을 수행하고 현재의 i값은 6이 되어있음으로
		while(i<5) {
			i++;
			System.out.println(i);	
		}
		System.out.println("=================================");
	}

}
