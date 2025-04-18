package practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("출생 년도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.print("주민번호 뒷자리 첫번쨰 숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
//		int age = 2025 - yyyy;
//		String m= "남자";
//		String f= "여자";
//		
//		if(yyyy >= 2000) {
//			if(id ==3) {
//				System.out.println(m);
//			}else if(id == 4) {
//				System.out.println(f);
//			}else {
//				 System.out.println("잘못된 입력");
//			}
//		}
//		if(yyyy < 2000) {
//			if(id == 1) {
//				System.out.println(m);
//			}else if(id == 2) {
//				System.out.println(f);
//			}else {
//				 System.out.println("잘못된 입력");
//			}	 
//		}
//		System.out.println(age + "살" + gender + "입니다.");
		
		
		//나이계산 기준(2025) - 입력년도(2000) + 1 = 나이 //주석처리 필수 습관화
		//int age = 2026 - year; //2025기준 나이 계산
		int age = 2025 - year + 1;//한국 나이 계산 
		
		
		//년도 + 뒷자리가 잘못된 케이스는 구별하지 못하는 상태
		/*
		if(number == 1){
			System.out.println(age + "살 남자");
		}else if(number == 2){
			System.out.println(age + "살 여자");
		}else if(number == 3){
			System.out.println(age + "살 남자");
		}else if(number == 4){
			System.out.println(age + "살 여자");
		}else {
			System.out.println("잘못된 입력");
		}
		*/
		/*
		if(number == 1 && year < 2000){
			System.out.println(age + "살 남자");
		}else if(number == 2 && year < 2000){
			System.out.println(age + "살 여자");
		}else if(number == 3 && year >= 2000){
			System.out.println(age + "살 남자");
		}else if(number == 4 && year >= 2000){
			System.out.println(age + "살 여자");
		}else {
			System.out.println("잘못된 입력");
		}
		*/
		
		
		if((number == 1 && year < 2000) || (number == 2 && year < 2000) ||
				(number == 3 && year >= 2000) || (number == 4 && year >= 2000)) {
			
		}else {
			System.out.println("잘못된 입력");
		}
		
		if(( (number == 1 || number == 2) && year < 2000)
				||
			((number == 3 || number == 4) && year >= 2000) )  {
			
			//입력은 정상이다
			if((number == 1 || number == 3)) {
				System.out.println(age + "살 남자");
			}
			if((number == 2 || number == 4)) {
				System.out.println(age + "살 여자");
			}
			
			if(number == 1 || number == 3) {
				System.out.println(age + "살 남자");
			}else {			
			}
				
		}else {
			System.out.println("잘못된 입력");
		}
		//결과 출력
	}

}
