package study.start.var;

public class VAriable05 {

	public static void main(String[] args) {
		
//		String s = "text";
//	
//		System.out.println("출력 1");//ln은 줄바꿈 하는 역할
//		System.out.println(s);
//		System.out.println("출력 2");
//		
//		
//		System.out.print("출력 1");//ln은 줄바꿈 하는 역할
//		System.out.print(s);
//		System.out.print("출력 2");
		
		System.out.println();
		
		
		int hour =12;
		int minute = 36;
		//현재 12시 36분 입니다.
		
		// \
		System.out.println("현재 " + hour +"시 "+ minute +"분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다. \n", hour, minute) ;
		//앞뒤의 변수의 순서가 알맞게 위치해야 한다.
		
		System.out.printf("이자는 3.5%% 입니다. \n");
		
		String menu = "햄버거";
		minute =48;
		double rate = 4.1515;
		
		System.out.printf("오늘 %d분에 점심으로 %s를 먹고 은행 이자는 %f%%더라 \n", minute, menu, rate);
		
		
	}

}
