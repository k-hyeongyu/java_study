package practice.practice43;

public class Gas_stove extends Kitchen{

	int stove;
	String brand;
	int price;
	boolean on;
	
	public void powerOn() {   // 온도를 1도 올리는 메소드
		on = true;
		System.out.println("가스 켜짐 ");
	}
	public void powerOff() {   // 온도를 1도 올리는 메소드
		on = false;
		System.out.println("가스 꺼짐 ");
	}
	public void fireStrength(int level) {
        System.out.println("불 세기: " + level + "단계로 설정됨");
    }
	
}
