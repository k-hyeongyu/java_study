package cls02;

public class Ipad {
	//필수변수
	String owner;
	static String brand = "Apple"; //기본값으로 설정됨 static
	
	void powerOn() {
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner + "의 아이패드");
	}
	static void check() {
		System.out.println(brand + "에서 만든 아이패드");
		//this.owner = "소유주"; static은 주체 기준이 없이 호출 -> this 특징
		//System.out.println(owner + "의 아이패드");
		//System.out.println(iPad.brand + "에서 만든 아이패드");
		
	}
}
