package Interface.Interface02;

import java.util.ArrayList;
import java.util.List;

public class Inter02Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.c = new ApplePhone();
		p.call("1234");
		
		p.c = new SamsunPhone();
		p.call("5678");
		
		List<Callable> cList = new ArrayList<Callable>();
		cList.add(new ApplePhone());
		cList.add(new SamsunPhone());
		
		List<Connectable> bList = new ArrayList<Connectable>();
		bList.add(new SamsunPhone());
		bList.add(new BluetoothSpeaker());
	}

}
