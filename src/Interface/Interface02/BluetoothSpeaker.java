package Interface.Interface02;

public class BluetoothSpeaker implements Connectable{

	@Override
	public void connect() {
		System.out.println("스피커 블루투스 연결");

	}

	@Override
	public void disconnect() {
		System.out.println("스피커 블루투스 해체");

	}

	//블루투스 스피커

	//소리가 나는
	//블루투스로 연결 할 수 있어야 한다.
}
