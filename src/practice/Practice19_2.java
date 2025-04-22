package practice;

import java.util.Scanner;

public class Practice19_2 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		x = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		y = scan.nextInt();
		
		int minus = x - y;
		
		System.out.println("큰수에서 작은 수를 빼면 " + minus + "입니다.");
	}

}
