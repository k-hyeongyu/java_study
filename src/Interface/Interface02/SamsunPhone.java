package Interface.Interface02;

public class SamsunPhone implements Callable, Connectable{

	int callStatus; //전화상태

	@Override
	public void call() {
		System.out.println("삼성폰 전화통화 : ");	
		callStatus = Callable.CALL_ON;
	}

	@Override
	public void connect() {
		System.out.println("갤럭시 블루투스 연결");

	}

	@Override
	public void disconnect() {
		System.out.println("갤럭시 블루투스 해체");

	}

}
