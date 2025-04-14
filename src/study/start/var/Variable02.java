package study.start.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,8,10,16 진수 -> 정수형
		int num2 =0b1010; //2진수 10
		int num8 = 012; //8진수 10
		int num10 = 10; //10진수 10
		int num16 = 0x30; //16진수 48
		
		//주의 사항 : 전화번호 앞자리 
		//int num = 010; 전화번호 010이 아니라 8진수 10으로 인식
		//문자형태 char "010"으로 변수를 선언해야함
		
		char ch1 = 123; //숫자도 저장은 가능함   유닠
		char ch2 = 'B'; //문자 한개 '작은 따옴표'
		//char ch3 = 'AB'; 두개는 사용불가 큰따옴표 사용 불가
		
		System.out.println(123); //유니코드표 123이 { 일것
		System.out.println(ch2);
		
		
		String str1 = "AB";
		String str2 = "c"; // 'C'작은 따옴표 문자하나는  char타입사용
		String str3 = "한글문자열";
		String str4 = "01012345678";
		String str5 = "010-1234-5678"; 
		
		System.out.println(str1);
		System.out.println(str3 + str5);
		
		String menu = "나는 \"햄버거\"를 좋아한다."; //나는 "햄버거"를 좋아한다로 강조할경우 
		System.out.println(menu);
		
		System.out.println("Hello \t World \nWelcome");
		
		double db1 = 12.12;//실수형
		double db2 = 0.1212e2; //0.1212 * 10의 제곱 -> 12.12
		float f1 = 12.12f; //float에 실수 저장시에 f를 붙여야한다.
		
		//논리형 참/거짓 true/false
		boolean stop = true;
		boolean start = false;
		boolean imHungry = true;
		
	}

}
