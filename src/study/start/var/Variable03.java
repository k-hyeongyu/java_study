package study.start.var;

public class Variable03 {

	public static void main(String[] args) {

		//타입변환
		double d1 = 3.14;
		double d2 = d1; //같은 변수라 형변환 필요없음	
		
		int i1 = 30;
		int i2 = i1;
		
		//int i3 = 3.33; //int는 정수형이므로 오류가 난다, 저장불가
		
		double d3 = i1; //int -> double 자동타입변환
		
		int i3 = (int)d2; //작은타입 = (작은타입)큰타입 -> 강제타입변환
		System.out.println(d2); //d2는 d1 소수점 사용가능
		System.out.println(i3); //i3는 d2에서 int형으로 강제변환
		
		//자바 정수 > int타입
		//자바 실수 > double타입
		float f1 = 5.5f; //float타입에 double을 넣는다
		System.out.println(f1);
		
		
		double d4 = 15; //double =int 값 15 -> 15.0 으로 자동변환됨
		double d5 = 15.5;
 		System.out.println(d4);
 		
 		int i6 = 10;
 		double d6 = 5.5;
 		
 		double result1 = i6 + d6; //int + double > double타입으로 인식
 		System.out.println(result1);
 		
 		//    int  =  double
 		//int result = i6 + d6;  int + double
 		int result2 = i6 + (int)d6; //int +int (5.5 -> 5로 형변환이 됨)
 		
 		result2 = (int)(i6+d6); //(int)(double) double을 int로 강제변환
 		
 		double dv1 = 5.5;
 		double dv2 = 6.5;
 		
 		int rst = (int)dv1 + (int)dv2;
 		System.out.println(rst); //11
 		
 		rst = (int)(dv1+ dv2);
 		System.out.println(rst); //12
 		
 		int x =1;
 		int y =2;
 		double z = x/y;
 		//z = 0 , double -> int 
 		
 		
 		z = (double)x / y; //double /int = double
 		z = x / (double)y; //int/double =double
 		z = (double)x / (double)y; //double /double = double
 		System.out.println(z);
 		
 		
 		z = 10.0/3;  //  int/int
 		System.out.println(z);
 		
 		String value = 1 + 3 +"3";
 		System.out.println(value);
	}

}
