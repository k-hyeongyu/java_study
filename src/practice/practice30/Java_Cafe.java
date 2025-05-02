package practice.practice30;

public class Java_Cafe {

	public static void main(String[] args) {  //메인 메소드 영역
		printPay(10.00, 40);	//400.00 10달러 * 40시간
		printPay(10.00, 50);	//500.00 10달러 * 40시간  +  10달러 * 1.5초과수당 * 10시간
		printPay(7.50, 38);		//최저시금 에러
		printPay(8.50, 66);		//초괴 근무시간 에러
	}
	// 시급과 일한 시간을 입력받아, 주급을 출력
	public static void printPay(double basePay, int hours) { //출력 메소드 영역
		double pay = 0.0;
		/* 해당 메소드를 완성하세요. */

		if(hours > 40){
			pay = (basePay * 40) + ((hours - 40) * basePay * 1.5);
		}else {
			pay = basePay * hours; // 시급 * 시간
		}


		if(basePay < 8) {
			System.out.println("최저시급 에러");
			return;
		}

		if(hours > 60) {
			System.out.println("초과 근무시간 에러");
			return;
		}

		System.out.printf("$ %.2f\n", pay);
	}
}
