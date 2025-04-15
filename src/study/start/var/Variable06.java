package study.start.var;

import java.util.Scanner; //Scanner 라이브러리를 import(가져옴/불러옴)

public class Variable06 {

	public static void main(String[] args) {
		//사용자 입력
		//스캐너라는 이름의 변수
		
		Scanner scanner = new Scanner(System.in); //스캐너 생성
		
		System.out.println("입력");
		
		String inputData = scanner.nextLine(); //다음 엔터까지 입력된 값 읽어오기
		
		System.out.println("입력완료");
		System.out.println(inputData);
		
		System.out.print("지금 몇시죠? : ");
		int hour = scanner.nextInt();
		
		System.out.printf("아 지금 %d시 입니다. \n", hour);
		
		System.out.print("중간고사 평균 점수 입력 : ");
		double mean = scanner.nextDouble();
		System.out.printf("%.2f점 입니다\n", mean);
	}

}
