package practice;

public class Practice03 {

	public static void main(String[] args) {
//		1. 아래 1), 2) 에 맞게 풀이.
		
//	1) 결과가 2가 나오도록 작성하세요
	/*int x = 10;
	int y = 4;
	int result = x/y;
	System.out.println(result);*/
//		
//	2) 결과가 2.5가 나오도록 작성하세요
//		int x = 10;
//		int y = 4;
//		double result = (double)x/y;
//		System.out.println(result);
//
//	2. 결과가 7.5가 나오도록 작성하세요
//	double a = 3.5; 
//	double b = 4.7; //실수형 4.7에서 정수형 4로 강제변환하기
//	double result = a + (int)b;
//	System.out.println(result);

//	3. 계산결과가 12가 나오도록 작성하세요
	/*String a = "3.4";
	String b = "4";
	int result = (int)Double.parseDouble(a) 
				      * Integer.parseInt(b);
	System.out.println(result);*/

//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
//	String a = "10";
//	int b = 3;
//	double c = 4.5;
//	
//	String sum = a + (b * c); //sum =
//	int result = (int)Double.parseDouble(a + b * c);
//	String result = a +((int)(b*c));
//	System.out.println(result);

//
//		(========5번은 도저히 모르겠습니다.===========)
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요. 
	int a = 4;
	double b = 3.4;
	String c = "6.8"; 
	
	String result = ((int)Double.parseDouble(c) - a) + String.valueOf(a)  + (int)b;
	System.out.println(result);
//		(========5번은 도저히 모르겠습니다.===========)

//
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
//	1) 출력결과 : 7
//	int x = 111;
//	int y = 13;
//	int result = x%y;
//	System.out.println(result);
		
//	2) 출력결과 : 8
//	int x = 111;
//	int y = 13;
//	int result = x/y;
//	System.out.println(result);

	}

}
