package practice;

import java.util.Scanner;

public class Practice17_Lesson {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("5. 종료");
		
		String[] numArr = {"입력","수정","조회","삭제","종료"}; 
		
		for(int i = 0; i<numArr.length; i++) {
			System.out.println((i+1) + ". "+ numArr[i]);
		}
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num ==1)
			System.out.println("입력 메뉴 입니다.");
		else if(num == 2)
			System.out.println("수정 메뉴 입니다.");
		else if(num == 3)
			System.out.println("조회 메뉴 입니다.");
		else if(num == 4)
			System.out.println("삭제 메뉴 입니다.");
		else if(num == 5)
			System.out.println("프로그램이 종료됩니다.");
		else
			System.out.println("잘못된 입력");
			
	}

}
