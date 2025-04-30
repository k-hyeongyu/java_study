package practice.practice29;

public class Monitor_Main {

	public static void main(String[] args) {
		
		Monitor monitor1 = new Monitor("삼성", 27, 150000);
		monitor1.setColor("검정색");
		//monitor1.color = "검정색";
		monitor1.setXY(1080, 780);
		monitor1.powerOn();
		
//		7. 두 개의 모니터를 생성합니다. -> main 에서 객체 생성 new Monitor
//		1) 삼성 27인치 150,000 검은색
//		2) LG 32인치 330,000
//		8. 모니터의 색상과 해상도가 결정되었습니다. -> 해상도값 저장 4번 생성한 set메소드 활용
//		1) 1080 * 780
//		2) 흰색, 4096 * 2048
		
		Monitor monitor2 = new Monitor("LG", 32, 330000);
		monitor2.setColor("흰색");
		//monitor2.color = "흰색";
		monitor2.setXY(4096, 2048);
		monitor2.powerOn();
		
		
		int m2Price = monitor2.priceIncrease(70000);
		
		System.out.println("모니터2 가격 인상 후 금액 정보 : " + m2Price);
	}
}
