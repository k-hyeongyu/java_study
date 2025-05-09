package inheritance.inheri06;

public class Main {

	public static void main(String[] args) {

		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();

		d.drive(b);
		d.drive(t);
		
		Bus b2 = takeBus();
		Taxi t2 = takeTaxi();
	}
	public static Bus takeBus() {
		//Bus b = new Bus();
		return new Bus();
	}
	public static Taxi takeTaxi() {
		return new Taxi();
	}
//	public static Vehicle takeVehicle() {
		
//		return new Vehicle();
//		return new Bus();
//		return new Taxi();
	}
