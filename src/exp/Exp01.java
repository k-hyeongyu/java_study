package exp;

import java.util.Scanner;

public class Exp01 {

	public static void main(String[] args) {
		
		//예외처리
		
		//일반예외				/ 실행예외
		//컴파일Exception 	/ 런타임Exception
		//CheckedException  / UnCheckedException
		
		Temp t1 = new Temp();
		Temp t2 = null;
		
		t1.t = 100;
		
		if(t2 != null)
			t2.t = 200;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");

		
		int input;
		
		//1회성 입력 기회를 주는 예외처리
		/*
		try {
			//int input = sc.nextInt();
			//try 지역변수 input 외부에서 접근 불가능
			
			input = sc.nextInt();
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("숫자는 디엠으로 부탁드립니다");
			sc.nextLine();
			input = sc.nextInt();
		}
		
		*/
		while(true) {
			
			try {
				System.out.println("숫자를 입력하세요 : ");
				input = sc.nextInt();
				sc.nextLine();
				break;
			}catch(Exception e) {
				//e.printStackTrace();
				System.out.println("숫자는 디엠으로 부탁드립니다");
				sc.nextLine();
			}
		}
		
		//문자로 입력 받기 -> 숫자로 변환하기
		System.out.println("숫자를 입력하세요 : ");
		String s = sc.nextLine(); // "123"
		
		//Sting -> int 변환
		try {
			System.out.println("parseInt 전");
			input = Integer.parseInt(s);
			System.out.println("parseInt 후");
		} catch(Exception e) {
			System.out.println(e.getMessage()); //입력이 
		} finally { //finally 는 무조건 출력, 생략 가능
			System.out.println("this is finally");
		}
		
		
		System.out.println("입력한 값 : " + input);
		
		System.out.println("********Finish*********");
		
		//instance of 
		P p = new C();
		C c = (C)p;
		
		P p2 = new P();
		C c2 = (C)p2; //ClassCastException
	}

}


class Temp{
	int t;
}

class P{
	
}

class C extends P{
	
}











