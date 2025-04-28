package cls.cls01;

public class Car {
	
	//속성(필드)
	String model;
	String color;
	int price;
	
	//아무것도 하지않는 기본 생성자
	//생성자를 작성하지 않아도, 기본으로 만들어지는 생성자
	Car(/*매개변수 없음*/){ 
		System.out.println("Car() 생성자 호출됨");
		color = "gray";
	}
	//매개변수(브로커, 매개체)가 존재하는 생성자
	Car(String c/*매개변수 있는 생성자*/){
		System.out.println("Car(String c) 생성자 호출됨");
		color = c;
	}
	
	//String c = blue, int p  = 10000000
	Car(String c, int p){ //첫번째는 컬러, 두번째는 가격
		System.out.println("Car(String c,int p) 생성자 호출됨");
		color = c;
		price = p;
	}

	Car(String model, String color, int price){ //첫번째는 컬러, 두번째는 가격
		System.out.println("Car(String m, String c, int p) 생성자 호출됨");
		this.model = model;
		this.color = color;   
		this.price = price;
	}
	/*
	Car(String _model, String _color, int _price){ //첫번째는 컬러, 두번째는 가격
		System.out.println("Car(String m, String c, int p) 생성자 호출됨");
		model = _model;
		color = _color;   
		price = _price;
	}
	*/
}
