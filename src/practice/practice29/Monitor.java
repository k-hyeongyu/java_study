package practice.practice29;

public class Monitor {

	//개념을 클래스로 옮겨 작성해보기
	String company;
	int inch;
	int price;
	String color;
	int maxPxX;
	int maxPxY;

	Monitor(){}  
	Monitor(String company, int inch, int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	void setColor(String color) {  //메소드는 일회용
        this.color = color;
        //입력 -> 수행할 코드 -> 출력
        //매개변수 -> 코드 -> return
    }
	void setXY(int maxPxX, int maxPxY) {
        this.maxPxX = maxPxX;
        this.maxPxY = maxPxY;
    }
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
    }
//	6. 모니터 클래스에는 가격인상 기능이 있습니다. -> return금액 가격인상 메소드
//	입력된 만큼의 금액이 인상되고 인상된 후 최종 금액을 반환합니다.
	int priceIncrease(int amount) {  //매개변수로 증가할 금액
		this.price += amount; //필드변수의 값을 바꿔주고
		return this.price;	  //바뀐 값을 다시 리턴함
    }
	
//	9. 모니터 클래스에는 자신의 정보를 정렬하여 출력해주는 기능이 있습니다. -> 출력기능 메소드
	void printInfo() {
		System.out.printf("%s %d인치 %s 모니터 : %d원 해상도 : %d * %d \n",
				 company, inch, color, price, maxPxX, maxPxY);
	}
	


//	10. 1), 2) 모니터의 정보를 출력합니다. -> 9번활용 출력
//	11. 2) 의 가격이 7만원 인상시키고, 그 결과 총금액을 받아서 출력합니다.-> 6번,9번 메소드활용 (9번은...밑에 12번에서 출력을 다시 하니까...6번만해도..되겠군요)
//	12. 1), 2)에 해당하는 정보를 다시 출력합니다. -> 9번활용 출력
	
}
