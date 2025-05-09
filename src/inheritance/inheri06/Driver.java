package inheritance.inheri06;

public class Driver {

//	public void drive(Bus bus){
//		System.out.println("Driver 운전시작");
//		bus.run();
//	}
//	public void drive(Taxi taxi){
//		System.out.println("Driver 운전시작");
//		taxi.run();
//	}
	public void drive(Vehicle vehicle) {
		System.out.println("Driver 운전시작");
		vehicle.run();
	}
}