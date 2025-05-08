package inheritance.inheri03;

public class Mike_Main {

	public static void main(String[] args) {
		
		Mike m1 = new Mike();
		m1.volUp();
		
		WirelessMike wm1 = new WirelessMike();
		wm1.volUp();
		
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volUp();
		bm1.volUp(5); //매개변수(파라미터)가 있는 메소드
		
		Mike m2 = new WirelessMike();
		Mike m3 = new BluetoothMike();
		m3.volUp();
		//부모타입 객체에 자식타입의 객체가 들어가는건 가능함

		m2.volUp();
		m3.volUp();
		m3.check();
		
		BluetoothMike bm2 = new BluetoothMike();
		
	}

}