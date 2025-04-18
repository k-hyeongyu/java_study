package practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		System.out.println("====================================");
		String num = "12345";
		
		for(int i=0; i<5; i++) {
			System.out.println(num);
		}
		System.out.println("====================================");
		
		for(int i= 1; i<=5;i++) {
			//System.out.println(i);
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
	
		if(year % 4 == 0 && year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		}
		if(year%100 != 0) {
			 System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}

}
