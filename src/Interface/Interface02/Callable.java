package Interface.Interface02;
//인터페이스는 클래스와 중간에 연결해주는 기능
public interface Callable {

	//static final
	public int CALL_ON = 1;
	public int CALL_OFF = 2;

	public void call();
	//abstract
}
