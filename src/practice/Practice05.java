package practice;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		//1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
//		int num = 0;
//		String num1 = (num > 0) ? "양수" : 
//						(num == 0) ? "0" : "음수";
//		
//		System.out.println(num1);
		
		
		//2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
		// ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
		// 나누기 결과는 소수점을 포함하여 나타나도록 해주세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = scan.nextInt();  //scan.nextInt(); 는 숫자를 입력 받을 수 있는 메소
		System.out.println("입력한 숫자 = " + num1);
		
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("입력한 숫자 = " + num2);

		
		System.out.println("더하기 : " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("빼기 : " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("곱하기 : " + num1 + " * " + num2 + " = " + (num1 * num2));
		
		double divRemain = (double) num1/num2;
		System.out.println("나누기 : " + num1 + " / " + num2 + " = " + divRemain);
	
	}

}
