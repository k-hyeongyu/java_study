package cls.cls01;

public class CarMain {

	public static void main(String[] args) {
	
		Car car1 = new Car(); //생성자가 호출됨(실행).
		Car car2 = new Car();
		Car car3 = new Car("white");
		
		System.out.println(car1.color);
		System.out.println(car3.color);
		
		Car car4 = new Car("black");
		System.out.println(car4.color);
		
		Car car5 = new Car("blue", 10000000);
		System.out.println(car5.color);
		System.out.println(car5.price);
		
		car5.color = "yellow";
		car5.model = "yellow";
		System.out.println(car5.model);
		System.out.println(car5.color);
		System.out.println(car5.price);
		
		Car car6 = new Car("sonata", 10000000);
		System.out.println(car6.color);
		
	}

}
