package cls02;

public class FinalMain {

	public static void main(String[] args) {

		/*
		ex int  n =10;
		n = 20;
		n = 30; 은 다음에 값을 넣게 되면 새로운 값으로 초기화가 됨.
		*/
		//상수화 -> 상시적으로 유지되는 값
		final int a = 30;
		// int a = 50을 작성해도 final이 붙어있다면 바뀌지 않음
		
		System.out.println(ContantNumber.TIMEOUT_LIMIT_SECONDS);
		
		int myState = 3;
		
		if(myState ==3 ) {
			System.out.println("건강하다.");	
		}
		
		myState = ContantNumber.HEALTH_STATE_GODD;
		
		if(myState == ContantNumber.HEALTH_STATE_GODD) {
			
		}
		if(myState == ContantNumber.HEALTH_STATE_BAD) {
					
		}
	}

}
