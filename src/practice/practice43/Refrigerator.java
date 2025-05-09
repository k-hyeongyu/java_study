package practice.practice43;

public class Refrigerator extends Kitchen{

	String brand;
	int liter;
	boolean power;
	int door;
	int temp;

	public void powerOn() {   // 온도를 1도 올리는 메소드
		power = true;
		System.out.println("전원 켜짐 ");
	}
	public void powerOff() {   // 온도를 1도 올리는 메소드
		power = false;
		System.out.println("전원 꺼짐 ");
	}
	public void tempUp() {   // 온도를 1도 올리는 메소드
		++temp;
		System.out.println("온도 올라감");
	}
	public void tempDown() {   // 온도를 1도 올리는 메소드
		--temp;
		System.out.println("온도 내려감");
	}
}
