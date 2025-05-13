package Interface.inter01;


//상속     자식 클래스 extends 부모클래스
//인터페이스 구현 클래스 implements 인터페이스
public class ImpleClass implements inter01 {

	@Override
	public void method1() {
		System.out.println("method1111");	
	}
	@Override
	public void method2() {
		System.out.println("method2222");	
	}
}
