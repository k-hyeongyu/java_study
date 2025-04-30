package cls02;

import java.util.Scanner;

public class Ipad_Main {

	public static void main(String[] args) {
		Ipad pad1 = new Ipad();
		pad1.owner = "홍길동";

		pad1.powerOn();
		
		System.out.println("============================");
		
		Ipad pad2 = new Ipad();
		pad1.owner = "가나다";

		pad1.powerOn();
		
		Scanner scanner = new Scanner(System.in);
	 // 클래스  클래스타입참조변수           
		
		String ss = "123";
		
		int ii = Integer.parseInt(ss);
		
		int num = (int)(Math.random()*6) +1;
		
		System.out.println(Math.PI);
		
		Ipad.check();
		
		//pad2.check(); //동일한 설계도에 있음. 단 노란색은 권장 방식은 아님
	}

}
