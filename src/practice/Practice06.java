package practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("밑변을 입력하세요 : ");
//		int width = scan.nextInt();
//		System.out.print("높이를 입력하세요 : ");
//		int triHeight = scan.nextInt();
//
//		System.out.println("삼각형 넓이 : " + (double)(width * triHeight)/2);
	
		

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
//		System.out.print("윗변 길이를 입력하세요 : ");
//		int topWidth = scan.nextInt();
//		System.out.print("밑변 길이을 입력하세요 : ");
//		int botWidth = scan.nextInt();
//		System.out.print("높이를 입력하세요 : ");
//		int height = scan.nextInt();
//		
//		System.out.println("사다리꼴 넓이 : " + (double)(topWidth + botWidth)*height/2);
//		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
//		int snack = 100;
//		int child = 24;
//		System.out.println("1인당 : " + (snack/child) + "개");
//		System.out.println("남은 과자 : " + (snack%child) + "개");
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		System.out.print("숫자 입력 : ");
		int n = scan.nextInt();
		
		int first = n/100;
		int second = (n/10)%10;
		int third = n%10;
		
		System.out.println("백의자리 : " + first);
		System.out.println("십의자리 : " + second);
		System.out.println("일의자리 : " + third);
		

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
//		int x = 10;
//		int y = 20;
//		System.out.println("x="+x+ " y="+y);
//		//x와 y를 바꾼 작업
//		//
//		//
//		int z = x;  //z= 10
//		int x1= y;   //x1= 20
//		int y1 = z;	//  y1= 10
//		
//		System.out.println("x="+x1 + " y="+y1);

	}

}
