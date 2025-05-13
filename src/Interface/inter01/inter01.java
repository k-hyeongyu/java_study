package Interface.inter01;

public interface inter01 {

	//필드 X -> 변수선언 (상수)
	static final int TYPE = 500;
	/*static final(기본적으로 적용되어있음)*/ int CODE = 10;
	
	//붕어삥 속 토핑 종류
	int FISHBREAD_TOPPING_PPAT = 11;
	int FISHBREAD_TOPPING_SUCREAN = 12;
	int FISHBREAD_TOPPING_PIZZA = 13;
	int FISHBREAD_TOPPING_KIMCHI = 14;
	
	//생성자 -> XXX
	
	//메소드 -> 추상 메소드 (선언 부분만)
	public abstract void method1();
	public /*abstract(보이진 않지만 선언되어있음)*/ void method2();
}
